package com.java.casestudy2;

public class JohnObserver extends INotificationObserver 
{
	String name="John";
	
	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

}
