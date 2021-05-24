package com.cognizant.restapi.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.restapi.model.Employee;
import com.cognizant.restapi.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
//	@PostConstruct
//	public void init()
//	{
//		employeeService.
//	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
}
