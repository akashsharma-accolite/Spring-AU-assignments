package com.FactoryPattern;

public class Car implements Vehicle
{
	@Override
	public void ride()
	{
		System.out.println("Inside Car's ride method");
	}
}
