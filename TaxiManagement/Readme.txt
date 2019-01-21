Taxi Management System

1)Passenger.java

Contains the passenger object with its different attributes

2)PassengerQueueRunnable.java

Thread for generating a new passenger every one second

3)Taxi.java

Used for creating Taxi objects, its properties and methods. 

4)TaxiQueueRunnable.java

Thread for generating a new Taxi every 4 seconds.

5)TaxiStand.java

Main class.Runs the two threads in parallel and contains logic for allocating passengers to taxi.