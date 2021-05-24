package com.adapter;

public class Client
{

public static void main(String[] args)
{
	Movable car=new BugattiVeyron();
	MovableAdapterImpl obj=new MovableAdapterImpl(car);
	System.out.println(obj.getSpeed());
	System.out.println(obj.getPrice());
	
}
}
