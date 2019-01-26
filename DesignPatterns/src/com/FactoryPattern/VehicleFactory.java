package com.FactoryPattern;

public class VehicleFactory 
{
	public Vehicle getVehicle(String vehicle)
	{
		if(vehicle==null)
		{
			return null;
		}
		else if(vehicle.equalsIgnoreCase("CAR"))
		{
			return new Car();
		}
		else if(vehicle.equalsIgnoreCase("TRUCK"))
		{
			return new Truck();
		}
		else if(vehicle.equalsIgnoreCase("BIKE"))
		{
			return new Bike();
		}
		
		return null;
	}
}
