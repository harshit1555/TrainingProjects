package com.cognizant.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.h2.model.ABC;
import com.cognizant.h2.repo.AbcRepository;

@RestController
public class ControllerAbc 
{
	@Autowired
	AbcRepository abcRepository;
	@GetMapping("/abc")
	public List<ABC> getAll()
	{
		return abcRepository.findAll();
	}
}
