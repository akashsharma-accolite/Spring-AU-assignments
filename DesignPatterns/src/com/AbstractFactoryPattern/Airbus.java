package com.AbstractFactoryPattern;

public class Airbus implements Aircraft{
	@Override
	public void fly()
	{
		System.out.println("Inside Airbus' fly method");
	}

}