package com.cognizant.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


//import com.cognizant.ormlearn.model.Department;

public interface DepartmentRepository extends JpaRepository<com.cognizant.restapi.model.Department, Integer>
{

}
