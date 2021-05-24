package com.cognizant.truyum.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem 
{
	@Id
	private long id;
	private String name;
	private float price;
	private boolean active;
	private LocalDate dateOfLaunch;
	private String category;
	private boolean freeDelivery;
	
}
