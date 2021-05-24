package com.cognizant.restapi.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restapi.dao.EmployeeDao;
import com.cognizant.restapi.model.Employee;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeDao employeeDao;
	public List<Employee> getAllEmployee()
	{
		return employeeDao.getAllEmployee();
	}
}
