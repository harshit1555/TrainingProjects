package com.cognizant.truyum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemRepo extends JpaRepository<MenuItem, Long>
{

}
