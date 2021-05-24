package com.cognizant.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.microservice.model.CartDetails;
import com.cognizant.microservice.service.CartService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class CartController 
{
	@Autowired
	CartService cartService;
	
	@GetMapping("/item/{menuItemId}/coupon/{couponCode}")
	@HystrixCommand(fallbackMethod = "getCartDetailsFallback")
	public CartDetails getCartDetails(@PathVariable long menuItemId, @PathVariable String couponCode) {
		return cartService.getCartDetails(menuItemId, couponCode);
	}

	public CartDetails getCartDetailsFallback(@PathVariable long menuItemId, @PathVariable String couponCode) {
//		log.error("cart-service responded fallback");
		return new CartDetails(menuItemId, "Brownie", 200, couponCode, 10, 100, 200, 0, 0);
	}
}
