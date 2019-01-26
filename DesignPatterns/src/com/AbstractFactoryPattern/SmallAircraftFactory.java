package com.AbstractFactoryPattern;

public class SmallAircraftFactory extends AbstractAircraftFactory
{
	@Override
	Aircraft getAircraft(String aircraftType) 
	{
		if(aircraftType.equalsIgnoreCase("Cessna"))
		{
	         return new SmallCessna();         
	    }
		else if(aircraftType.equalsIgnoreCase("Bombardier"))
		{
	         return new SmallBombardier();
	    }	 
	      return null;
	}
}
