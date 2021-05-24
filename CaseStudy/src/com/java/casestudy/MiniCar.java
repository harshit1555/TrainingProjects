package com.java.casestudy;

public class MiniCar extends Car 
{
	public MiniCar(Location location)
	{
		super(CarType.MINI,location);
		construct();
		System.out.println(location);
	}
@Override
void construct() {
	// TODO Auto-generated method stub
	System.out.println("Connecting to Mini Car");
}
}
