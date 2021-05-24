package com.cognizant.microservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.microservice.model.Vendor;
import com.cognizant.microservice.model.VendorStock;
import com.cognizant.microservice.repo.VendorStockRepository;

@Service
public class VendorStockServiceImpl implements VendorStockService
{

	@Autowired
	private VendorStockRepository vendorStockRepository;
	
	@Autowired
	private VendorService vendorService;
	
	@Transactional
	@Override
	public void save(VendorStock vendorStock) 
	{
		vendorStockRepository.save(vendorStock);
	}
	
	@Override
	public Vendor getVendor(long productId, int quanity) 
	{
		List<Long> vendorIdList=vendorStockRepository.getVendorIds(productId, quanity);
		Vendor finalVendor=null;
		double temp=Double.MIN_VALUE;
		for(long id:vendorIdList)
		{
			Vendor vendor=vendorService.findByVendorId(id);	
			if(temp<vendor.getRating())
			{	
				temp=vendor.getRating();
				finalVendor=vendor;
			}
		}
		
		return finalVendor;
	}
  // vender id lists
	
	  //vender->rating
	
	
	
}
