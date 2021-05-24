package com.cognizant.restapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.restapi.model.Department;
import com.cognizant.restapi.repository.DepartmentRepo;

@Component
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	DepartmentRepo departmentRepo;
	@Override
	public List<Department> getAllDepartment() 
	{
		
		return departmentRepo.findAll();
	}
	@Transactional
	public Department addDepartment(Department department)
	{
		return departmentRepo.save(department);
	}

}
