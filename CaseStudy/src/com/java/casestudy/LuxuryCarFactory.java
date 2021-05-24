package com.java.casestudy;

public class LuxuryCarFactory extends CarFactory
{
	Location location;
 public LuxuryCarFactory(Location location)
 {
	 this.location=location;
 }
 @Override
public Car buildCar() {
	// TODO Auto-generated method stub
	return new LuxuryCar(location);
}
}
