package com.java.casestudy;

public class MicroCar extends Car
{
	public MicroCar(Location location)
	{
		super(CarType.MICRO,location);
		construct();
		System.out.println(location);
	}
	
	
	@Override
	void construct()
	{
		System.out.println("Connecting to Micro Car");
		
	}
}
