package com.cognizant.microservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.microservice.exception.ProductNotFoundException;
import com.cognizant.microservice.exception.RatingGreaterThan5Exception;
import com.cognizant.microservice.model.Product;
import com.cognizant.microservice.service.ProductServiceImpl;

@RestController
public class ProductController 
{
	@Autowired
	ProductServiceImpl productService;
	
	@GetMapping("/productById/{id}")
	public Product searchProductById(@PathVariable String id) throws ProductNotFoundException
	{
		return productService.searchProductById(Integer.parseInt(id));
	}
	@GetMapping("/productByName/{name}")
	public Product searchProductByName(@PathVariable String name) throws ProductNotFoundException
	{
		return productService.searchProductByName(name);
	}
	@PostMapping("/addRating")
	public Product addProductRating(@RequestBody Product product) throws ProductNotFoundException,RatingGreaterThan5Exception
	{
		return productService.addProductRating(product);
	}
}
