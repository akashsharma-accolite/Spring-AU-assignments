package com.AbstractFactoryPattern;

public class FactoryProducer 
{
	
	 public static AbstractAircraftFactory getFactory(boolean small)
	   {   
	      if(small)
	      {
	         return new SmallAircraftFactory();         
	      }
	      else
	      {
	         return new BigAircraftFactory();
	      }
	   }
}


	  