package com.cognizant.microservice.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.microservice.model.Vendor;
import com.cognizant.microservice.model.VendorStock;
import com.cognizant.microservice.service.VendorStockService;

@RestController
@RequestMapping("/vendor")
public class VendorController 
{

		@Autowired
		VendorStockService vendorStockService;
		
		@GetMapping("/vendor/{productId}/{quantity}")
		public Vendor getVendor(@PathVariable int productId, @PathVariable int quantity)
		{
			return vendorStockService.getVendor(productId, quantity);
		}
		
	/*
	  @GetMapping("/add")
	  public String addVendorStock() {
		  vendorStockService.save( new VendorStock(1,1, 99, 15,LocalDate.of(2020, 11, 01)) );
		  vendorStockService.save( new VendorStock(2,1, 99, 150,LocalDate.of(2020, 11, 02)) );
		  return "Added";
	  }*/
	
	
}
