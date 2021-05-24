package com.java.casestudy;

public class MiniCarFactory extends CarFactory
{
	Location location;
	public MiniCarFactory(Location location)
	{
		this.location=location;
	}
	public Car buildCar() {
		// TODO Auto-generated method stub
		return new MiniCar(location);
	}
}
