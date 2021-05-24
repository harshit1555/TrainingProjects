package com.java.casestudy;

public class carClient 
{
	public static void main(String[] args) 
	{

		BuilderFactory builderFactory=new BuilderFactory();
		System.out.println(builderFactory.getCar(CarType.LUXURY,Location.DEFAULT).buildCar());
		System.out.println(builderFactory.getCar(CarType.MICRO,Location.USA).buildCar());
		
	}
}
