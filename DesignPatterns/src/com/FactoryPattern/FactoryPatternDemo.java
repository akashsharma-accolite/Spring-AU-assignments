package com.FactoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) 
	{
		VehicleFactory vf=new VehicleFactory();
		
		Vehicle vehicle1=vf.getVehicle("CAR");
		vehicle1.ride();
		
		Vehicle vehicle2=vf.getVehicle("BIKE");
		vehicle2.ride();
		
		Vehicle vehicle3=vf.getVehicle("TRUCK");
		vehicle3.ride();
	}

}
