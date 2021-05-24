package com.cognizant.microservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon 
{
	@Id 
	@GeneratedValue
	private long id;
	
	private String couponCode;
	private double discount;
	private double maxDiscount;
	
	@Transient
	private int port;
}
