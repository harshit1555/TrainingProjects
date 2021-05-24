package com.cognizant.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restapi.dao.DepartmentDao;
import com.cognizant.restapi.model.Department;

@Service
public class DepartmentService 
{
	@Autowired
	DepartmentDao departmentDao;
	public List<Department> getAllDepartment()
	{
		return departmentDao.getAllDepartment();
	}
	public Department addDepartment(Department department)
	{
		return departmentDao.addDepartment(department);
	}
}
