package com.builderpattern;
public abstract class ColdDrink implements Item {


public Packing packing() 
{
  return new Bottle();
}
public abstract String name();
public abstract float price();


}