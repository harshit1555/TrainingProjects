package com.adapter;
public class MovableAdapterImpl implements MovableAdapter 
{ 
   private Movable luxuryCars;
   public double getSpeed()
  {
	  return convertMPHtoKMPH(luxuryCars.getSpeed()); 
  } 
   private double convertMPHtoKMPH(double mph)
  {
	   return mph * 1.60934; 
  }
   public double getPrice()
   {
 	  return convertUSDtoEURO(luxuryCars.getPrice()); 
   } 
    private double convertUSDtoEURO(double euro)
   {
 	   return euro * 0.84; 
   }
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}
}
