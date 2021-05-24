package com.cognizant.restapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.restapi.exception.CountryNotFoundException;
import com.cognizant.restapi.model.Country;
import com.cognizant.restapi.service.CountryService;

@RestController
public class CountryController 
{

//	List<Country> countries=new ArrayList<Country>();
	@Autowired
	CountryService countryService;
	@PostConstruct
	public void init()
	{
		countryService.addCountry(new Country("IN","India"));
		countryService.addCountry(new Country("US","United State of America"));
		countryService.addCountry(new Country("JP","Japan"));
		countryService.addCountry(new Country("DE","Germany"));
	}
	
	@GetMapping("/hello") 
	public String HelloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping("/country")
	public Country getCountryIndia()
	{
		return new Country("IN","India");
	}
	
	@PostMapping(produces = "application/json",value="/addcountry")
	public Country addCountry(@Valid @RequestBody  Country country)
	{
		return countryService.addCountry(country);
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountry()
	{
		return countryService.getAllCountry();
	}
	
	@PutMapping("/modifycountry")
	public Country modifyCountry( @RequestBody  Country country)
	{
		return countryService.modifyCountry(country);
	}
	@GetMapping("/country/{code}")
	public ResponseEntity<Country> getCountry(@PathVariable String code) throws CountryNotFoundException
	{
		Country country= countryService.getCountry(code);
		if(country==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(country));
	}
	@DeleteMapping("/deletecountry/{code}")
	public String deleteCountry(@PathVariable String code)
	{
		countryService.deleteCountry(code);
		return "Country Deleted";
	}
//	@GetMapping("/country/{code}")
//	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Country not found")
//	public Country getCountry(@PathVariable String code) 
//	{
//		Country country=countries.stream().filter(e->e.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
//		if(country==null)
//			throw new CountryNotFoundException(code); 
//		return country;
//	}
}
