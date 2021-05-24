package com.cognizant.restapi;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cognizant.restapi.controller.CountryController;
import com.cognizant.restapi.model.Country;
import com.cognizant.restapi.service.CountryService;

@WebMvcTest(CountryController.class)
class RestapiApplicationTests {

	@Autowired
	CountryController countryController;
	@Autowired
	MockMvc mockMvc;
	@MockBean
	CountryService countryService;
	@Test
	void contextLoads() throws Exception
	{
		Country country=new Country("IN","INDIA");
		when(countryService.getCountry("IN")).thenReturn(country);
		mockMvc.perform(get("/country/IN")).andExpect(status().isOk());
		
	}

}
