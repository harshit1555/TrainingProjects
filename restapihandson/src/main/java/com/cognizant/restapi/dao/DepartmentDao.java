package com.cognizant.restapi.dao;

import java.util.List;

import com.cognizant.restapi.model.Department;

public interface DepartmentDao 
{
	List<Department> getAllDepartment();
	public Department addDepartment(Department department);
}
