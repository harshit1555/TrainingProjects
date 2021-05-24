package com.cognizant.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.restapi.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
