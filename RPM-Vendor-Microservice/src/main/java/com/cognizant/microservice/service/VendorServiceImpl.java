package com.cognizant.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.microservice.model.Vendor;
import com.cognizant.microservice.repo.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService
{
	@Autowired
	VendorRepository vendorRepository;
	@Override
	public Vendor findByVendorId(long vendorId) 
	{
		return vendorRepository.findById(vendorId).orElse(null);
	}
}
