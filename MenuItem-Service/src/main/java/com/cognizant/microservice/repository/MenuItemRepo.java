package com.cognizant.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.microservice.model.MenuItem;

public interface MenuItemRepo extends JpaRepository<MenuItem, Long>
{

}
