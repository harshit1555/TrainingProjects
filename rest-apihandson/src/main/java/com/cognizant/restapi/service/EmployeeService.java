package com.cognizant.restapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restapi.model.Employee;
import com.cognizant.restapi.repository.DepartmentRepository;
//import com.cognizant.ormlearn.OrmLearnApplication;
//import com.cognizant.ormlearn.model.Employee;
import com.cognizant.restapi.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
//	private final Logger LOGGER=LoggerFactory.getLogger(OrmLearnApplication.class);
	@Transactional
	public Employee get(int id)
	{
//		LOGGER.info("Start");
		return employeeRepository.findById(id).get();
	}
	@Transactional
	public void save(Employee employee) 
	{
//		LOGGER.info("Start");
		
		employeeRepository.save(employee);
//		LOGGER.info("End");
	}
	@Transactional
	public List<Employee> getallPermanentEmployees()
	{
		List<Employee> employee=employeeRepository.getAllPermanentEmployees();
		return employee;
	}
	@Transactional
	public double getAverageSalary(int id)
	{
		double salary=employeeRepository.getAverageSalary(id);
		return salary;
	}
	@Transactional
	public List<Employee> getEmployeesByNative()
	{
		List<Employee> employee=employeeRepository.getAllEmployeesNative();
		return employee;
	}
	@Transactional
	public Employee modifyEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	@Transactional
	public void deleteEmployee(int employeeId)
	{
		employeeRepository.deleteById(employeeId);
	}
}
