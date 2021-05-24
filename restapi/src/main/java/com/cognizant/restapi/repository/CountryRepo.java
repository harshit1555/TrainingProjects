package com.cognizant.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.restapi.model.Country;

public interface CountryRepo extends JpaRepository<Country, String> 
{

}
