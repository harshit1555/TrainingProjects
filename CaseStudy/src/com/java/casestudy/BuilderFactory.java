package com.java.casestudy;

public class BuilderFactory 
{
 public CarFactory getCar(CarType carType, Location location)
 {
	 switch(carType)
	 {
	 case MICRO:
		 return new MicroCarFactory(location);
	 case MINI:
	 	return new MiniCarFactory(location);
	 case LUXURY:
		 return new LuxuryCarFactory(location);
	 }
	 return null;
	 }
}
