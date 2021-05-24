package com.cognizant.microservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.microservice.model.VendorStock;

public interface VendorStockRepository extends JpaRepository<VendorStock, Long> 
{
	
	//@Query("select c.menuItemId from Cart c where c.userId=:userId")
	
	@Query("select v.vendorId from VendorStock v where v.productId=:productId and stockInHand>=:quantity ")
	 public List<Long> getVendorIds(long productId, int quantity);

}
