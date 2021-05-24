package com.cognizant.microservice.model;

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
public class VendorStock 
{
	@Id
	@Column(name = "product_id")
	private int productId;
	@Column(name = "vendor_id")
	private int vendorId;
	@Column(name = "stock_in_hand")
	private int stockInHand;
	@Column(name = "expected_stock_replinshment_date")
	private LocalDate expectedStockReplinshmentDate;
	
}
