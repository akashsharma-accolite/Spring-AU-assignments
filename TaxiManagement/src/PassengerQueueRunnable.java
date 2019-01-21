import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class PassengerQueueRunnable implements Runnable {
	TaxiStand lot;
	LinkedList<Passenger> passengerQueue;
	int queueNumber = 0;

	public PassengerQueueRunnable(LinkedList<Passenger> queue, TaxiStand l) {
		passengerQueue = queue;
		lot = l;
	}

	@Override
	public void run() 
	{
		while (true) 
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException ie) 
			{

			}
			
			CopyOnWriteArrayList<Taxi> taxiStand = lot.getTaxistand();
			LinkedList<Taxi> taxiQueue = lot.getTaxiQueue();

			ListIterator<Taxi> itr = taxiStand.listIterator();
			while (itr.hasNext()) 
			{
				Taxi t = itr.next();
				if (t.getTaxiSize() > 0)
				{
					t.addTime();
					if (t.getTime() >= 60) 
					{
						System.out.println("TIMEOUT! Taxi to:" + t.getDestination() + "is leaving.");
						taxiStand.remove(t);
						if (taxiQueue.size() > 0)
							taxiStand.add(taxiQueue.removeFirst());
					}
				}
			}
			
			lot.setTaxiQueue(taxiQueue);
			lot.setTaxistand(taxiStand);
			int pick = new Random().nextInt(Passenger.DESTINATION.values().length);
			Passenger p = new Passenger(Passenger.DESTINATION_VALUES[pick]);
			System.out.println("New passenger with destination " + p.getDestination() + " arrives.");

			if (!lot.allocatePassengerTaxi(p)) 
			{
				System.out.println("No cab found for passenger. Adding to Queue..");
				passengerQueue.add(p);
				System.out.println("Passeneger added to queue...");
			}
		}
	}
}
