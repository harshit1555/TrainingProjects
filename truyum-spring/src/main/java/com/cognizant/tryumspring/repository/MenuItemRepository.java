package com.cognizant.tryumspring.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.tryumspring.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> 
{
	@Query(value = "Select m from MenuItem  m Where m.active=:active and m.dateOfLaunch")
	public List<MenuItem> getMenuItemListCustomer(@Param("active") boolean active,@Param("dateOflaunch") LocalDate dateOfLaunch);
	
}
