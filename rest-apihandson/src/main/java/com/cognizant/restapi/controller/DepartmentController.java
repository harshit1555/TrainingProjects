package com.cognizant.restapi.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.restapi.model.Department;
import com.cognizant.restapi.service.DepartmentService;

@RestController
public class DepartmentController 
{
	@Autowired
	DepartmentService departmentService;
	@PostConstruct
//	public void init()
//	{
//		departmentService.save(new Department(1, "Java"));
//		departmentService.save(new Department(2, "Python"));
//	}
	@GetMapping("/getDepartment")
	public List<Department> getAllDepartment()
	{
		return departmentService.getAllDepartment();
	}
}
