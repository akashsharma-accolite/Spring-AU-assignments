package com.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) 
	{
		AbstractAircraftFactory aircraftFactory=FactoryProducer.getFactory(false);
		Aircraft aircraft1=aircraftFactory.getAircraft("Boeing");
		aircraft1.fly();
		Aircraft aircraft2=aircraftFactory.getAircraft("Airbus");
		aircraft2.fly();
		
		AbstractAircraftFactory aircraftFactory1=FactoryProducer.getFactory(true);
		
		Aircraft aircraft3=aircraftFactory1.getAircraft("Cessna");
		aircraft3.fly();
		Aircraft aircraft4=aircraftFactory1.getAircraft("Bombardier");
		aircraft4.fly();
	}

}
