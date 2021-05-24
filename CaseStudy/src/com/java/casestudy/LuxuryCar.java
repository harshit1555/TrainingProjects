package com.java.casestudy;

public class LuxuryCar extends Car
{
	public LuxuryCar(Location location)
	{
		super(CarType.LUXURY,location);
		construct();
		System.out.println(location);
	}
	@Override
	void construct() {
		// TODO Auto-generated method stub
	System.out.println("connection to Luxury Car");	
	}
}
