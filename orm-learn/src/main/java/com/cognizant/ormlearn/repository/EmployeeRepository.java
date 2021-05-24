package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.ormlearn.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	@Query(value="Select e FROM Employee e WHERE e.permanent=1")
	public List<Employee> getAllPermanentEmployees();
	
	@Query(value="SELECT AVG(e.salary) FROM Employee e where e.department.id = :id")
	public double getAverageSalary(@Param("id") int id);
	
	@Query(value="SELECT * FROM employee", nativeQuery = true)
	public List<Employee> getAllEmployeesNative();
}
