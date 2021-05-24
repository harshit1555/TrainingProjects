package com.cognizant.microservice.exception;

public class RatingGreaterThan5Exception extends Exception 
{
	public RatingGreaterThan5Exception(String msg)
	{
		super(msg);
	}
}
