package com.java.casestudy;

public class MicroCarFactory extends CarFactory
{
	Location location;
	public MicroCarFactory(Location location)
	{
		this.location=location;
	}
	public Car buildCar()
	{
		// TODO Auto-generated method stub
		return new MicroCar(location);
	}
}
