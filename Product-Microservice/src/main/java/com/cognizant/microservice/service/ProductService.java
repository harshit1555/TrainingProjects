package com.cognizant.microservice.service;

import com.cognizant.microservice.exception.ProductNotFoundException;
import com.cognizant.microservice.exception.RatingGreaterThan5Exception;
import com.cognizant.microservice.model.Product;

public interface ProductService 
{
	public Product searchProductById(int productId) throws ProductNotFoundException;
	public Product searchProductByName(String productName) throws ProductNotFoundException;
	public Product addProductRating(Product product) throws ProductNotFoundException,RatingGreaterThan5Exception;
}
