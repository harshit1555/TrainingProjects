package com.java.finalcasestudy;

public class FactoryBuilder 
{
	public ProductFactory getProduct(OrderType orderType,ProductType productType)
	{
		switch(orderType)
		{
		case ECOMMERCE:
			return new EcommerceFactory(productType);
		case TELECALL:
			return new TeleCallFactory(productType);
		}
		return null;
		
	}
}
