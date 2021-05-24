package com.cognizant.microservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cognizant.microservice.model.Coupon;
import com.cognizant.microservice.repository.CouponRepo;

@Service
public class CouponService 
{
	@Autowired
	CouponRepo couponRepo;
	@Autowired
	Environment env;
	@Transactional
	public Coupon addCoupon(Coupon coupon)
	{
		int port=Integer.parseInt(env.getProperty("local.server.port"));
//		int port=Integer.parseInt(env.getProperty("local.server.port"));
		coupon.setPort(port);
		return couponRepo.save(coupon);
	}
	public Coupon getCoupon(Long couponId)
	{
		Coupon coupon=couponRepo.findById(couponId).orElse(null);
		return coupon;
		
	}
	public Coupon getCoupon(String couponId)
	{
		Coupon coupon=couponRepo.findByName(couponId);
		return coupon;
		
	}
}
