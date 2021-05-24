package com.cognizant.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.microservice.model.Coupon;
import com.cognizant.microservice.service.CouponService;

@RestController
public class CouponController 
{
	@Autowired
	CouponService couponService;
	@PostMapping("/addCoupon")
	public Coupon addCoupon(@RequestBody Coupon coupon)
	{
		return couponService.addCoupon(coupon);
	}
	@GetMapping("/coupon/{id}")
	public Coupon getCoupon(@PathVariable String id)
	{
		Coupon coupon=null;
		try {
			coupon=couponService.getCoupon(Long.parseLong(id));
		}catch(Exception e)
		{
			coupon=couponService.getCoupon(id);
		}
		return coupon; 
	}
}
