package com.cognizant.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.restapi.exception.CountryNotFoundException;
import com.cognizant.restapi.model.Country;

public interface CountryService 
{
	public Country addCountry(Country country);
	public List<Country> getAllCountry();
	public Country getCountry(String code) throws CountryNotFoundException;
	public Country modifyCountry(Country country);
	public void deleteCountry(String code);
}
