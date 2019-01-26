package com.AbstractFactoryPattern;

public class Boeing implements Aircraft{
	@Override
	public void fly()
	{
		System.out.println("Inside Boeing's fly method");
	}

}
