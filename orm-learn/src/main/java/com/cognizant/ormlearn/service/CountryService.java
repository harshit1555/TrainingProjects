package com.cognizant.ormlearn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;



@Service
public class CountryService
{
	@Autowired
	CountryRepository countryRepository;
	@Transactional
	public Country getCountryByCode(String code)
	{
		Country country=countryRepository.findById(code).orElse(null);
		return country;
		
	}
	@Transactional
	public List<Country> getAllCountries()
	{
		List<Country> countryList=countryRepository.findAll();
		return countryList;
	}
	@Transactional
	public void addCountry(Country country)
	{
		countryRepository.save(country);
	}
	@Transactional
	public void updateCountry(String code)
	{
		Country country=countryRepository.findById(code).orElse(null);
		country.setName("CHINNA");
		countryRepository.save(country);
		
		
	}
	@Transactional
	public void deleteCountry(String code)
	{
	Country country=countryRepository.findById(code).orElse(null);
	countryRepository.deleteById(code);
	}
	@Transactional
	public List<Country> getfindByName(String name)
	{
//		List<Country> list=countryRepository.findByNameStartingWith(name);
		List<Country> country=countryRepository.findByNameContainingOrderByNameAsc(name);
		return country;
	}
	@Transactional
	public List<Country> getCountryStartWith(String word)
	{
		List<Country> country=countryRepository.findByNameStartingWith(word);
		return country;
		
	}
	
	
}
