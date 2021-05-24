package com.AdapterPattern.AdapterPatternExample;

public class MovableAdapterImpl implements MovableAdapter 
{
	Movable luxuryCars;
	@Override
	public double getSpeed() 
	{
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	private double convertMPHtoKMPH(double mph)
	{
		return mph*1.60934;
	}

}
