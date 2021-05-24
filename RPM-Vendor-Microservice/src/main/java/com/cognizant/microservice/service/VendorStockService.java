package com.cognizant.microservice.service;

import java.util.List;

import com.cognizant.microservice.model.Vendor;
import com.cognizant.microservice.model.VendorStock;

public interface VendorStockService 
{

	public void save(VendorStock vendorStock);
	public Vendor getVendor(long productId, int quanity);
	
	    
}
