package com.java.casestudy2;

public class SteveObserver extends INotificationObserver
{
	String name="Steve";
	
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

	@Override
	public void OnServerDown() 
	{
		// TODO Auto-generated method stub
		System.out.println(this.name);

	}

}
