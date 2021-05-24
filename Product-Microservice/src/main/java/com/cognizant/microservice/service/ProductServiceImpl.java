package com.cognizant.microservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.microservice.exception.ProductNotFoundException;
import com.cognizant.microservice.exception.RatingGreaterThan5Exception;
import com.cognizant.microservice.model.Product;
import com.cognizant.microservice.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepo productRepo;
	
	public Product searchProductById(int productId) throws ProductNotFoundException
	{
		Product product=productRepo.findById(productId).orElse(null);
		if(product==null)
		{
			throw new ProductNotFoundException("Product with id ["+productId+"] not found");
		}
			return product;
		
	}
	public Product searchProductByName(String productName) throws ProductNotFoundException
	{
		Product product=productRepo.findByName(productName).orElse(null);
		if(product==null)
		{
			throw new ProductNotFoundException("Product with name ["+productName+"] not found");
		}
		return product;
	
	}
	@Transactional
	public Product addProductRating(Product product) throws ProductNotFoundException,RatingGreaterThan5Exception
	{
		Product productExists=productRepo.findById(product.getId()).orElse(null);
		
		if(product.getRating()<=5 && product.getRating()>0)
		{
			
		if(productExists!=null)
		{
			if(productExists.getRating()!=0)
			{		
				productExists.setRating((productExists.getRating()+product.getRating())/2);
			}
			else
			{
				productExists.setRating(product.getRating());
			}
		}
		else
		{
			throw new ProductNotFoundException("Product with id ["+product.getId()+"] not found");
		}
		}
		else
		{
			throw new RatingGreaterThan5Exception("Rating should be between 1 to 5");
		}
		productRepo.save(productExists);
		return productExists;
	}
}
