package com.factory;

public class Client 
{
	public static void main(String[] args) {
		
		Factory factory=new MercedesFactory();
		factory.makeHeadlight().getHeadlight();
		factory.makeTire().getTire();
	}
}
