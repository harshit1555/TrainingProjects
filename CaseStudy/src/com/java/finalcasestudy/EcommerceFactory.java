package com.java.finalcasestudy;

public class EcommerceFactory extends ProductFactory 
{
	ProductType productType;
	 public EcommerceFactory(ProductType productType )
	{
		this.productType=productType;
		System.out.println("E-Commerce website");
		// TODO Auto-generated constructor stub
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
