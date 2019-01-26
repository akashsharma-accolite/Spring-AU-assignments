package com.AbstractFactoryPattern;

public class BigAircraftFactory extends AbstractAircraftFactory 
{

	@Override
	Aircraft getAircraft(String aircraftType) 
	{
		if(aircraftType.equalsIgnoreCase("Boeing"))
		{
	         return new Boeing();         
	    }
		else if(aircraftType.equalsIgnoreCase("Airbus"))
		{
	         return new Airbus();
	    }	 
	      return null;
	}
}
