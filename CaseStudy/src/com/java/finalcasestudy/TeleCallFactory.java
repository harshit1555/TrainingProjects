package com.java.finalcasestudy;

public class TeleCallFactory extends ProductFactory 
{
	ProductType productType;
	 public TeleCallFactory(ProductType productType) 
	{
		 
		this.productType=productType;
		// TODO Auto-generated constructor stub
		System.out.println("Telecalling");
	}
	@Override
	public Order buildProduct() 
	{
		switch(productType)
		{
		case ELECTRONIC:
			return new ElectronicOrder();
		case TOYS:
			return new ToysOrder();
		case FURNITURE:
			return new FurnitureOrder();
		}
		return null;
	}
}
