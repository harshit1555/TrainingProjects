package com.cognizant.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.microservice.model.Account;

public interface AccountRepo extends JpaRepository<Account, Long> 
{
	
}
