package com.cognizant.restapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restapi.exception.CountryNotFoundException;
import com.cognizant.restapi.model.Country;
import com.cognizant.restapi.repository.CountryRepo;
@Service
public class CountryServiceImpl implements CountryService
{
	@Autowired
	CountryRepo countryRepo;
	@Override
	@Transactional
	public Country addCountry(Country country) 
	{
		return countryRepo.save(country);
		
	}
	@Override
	@Transactional
	public void deleteCountry(String code) 
	{
	 Country country=countryRepo.findById(code).orElse(null);
	  countryRepo.delete(country);
	}
	@Override
	@Transactional
	public List<Country> getAllCountry() 
	{
		List<Country> countries=countryRepo.findAll();
		
		return countries;
	}
	@Override
	@Transactional
	public Country getCountry(String code) throws CountryNotFoundException
	{
		if(!countryRepo.existsById(code))
		{
			throw new CountryNotFoundException("Country with code ["+code+"] Not Found");
		}
		return countryRepo.findById(code).orElse(null);
//		return countryRepo.findById(code).orElse(null);
	}
	@Override
	@Transactional
	public Country modifyCountry(Country country)
	{
		
		return countryRepo.save(country);
	}
	
}
