package com.cognizant.restapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.restapi.model.Employee;
import com.cognizant.restapi.repository.EmployeeRepo;

@Component
public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
	EmployeeRepo employeeRepo;
	@Override
	public List<Employee> getAllEmployee() 
	{
		return employeeRepo.findAll();
	}

}
