package com.cognizant.microservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan 
{
	@Id
	private long number;
	private String type;
	private double amount;
	private double emi;
	private int tenure;
}
