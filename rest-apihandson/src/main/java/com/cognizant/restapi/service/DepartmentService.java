package com.cognizant.restapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restapi.model.Department;
//import com.cognizant.ormlearn.OrmLearnApplication;
//import com.cognizant.ormlearn.model.Department;
import com.cognizant.restapi.repository.DepartmentRepository;

@Service
public class DepartmentService
{
	@Autowired
	DepartmentRepository departmentRepository;
//	private final Logger LOGGER=LoggerFactory.getLogger(OrmLearnApplication.class);
	public List<Department> getAllDepartment()
	{
		return departmentRepository.findAll();
	}
	@Transactional
	public Department get(int id)
	{
//		LOGGER.info("Start");
		return departmentRepository.findById(id).get();
	}
	@Transactional
	public void save(Department department) 
	{
//		LOGGER.info("Start");
		departmentRepository.save(department);
//		LOGGER.info("End");
	}
}
