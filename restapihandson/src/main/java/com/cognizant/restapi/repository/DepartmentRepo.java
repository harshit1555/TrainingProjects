package com.cognizant.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.restapi.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
