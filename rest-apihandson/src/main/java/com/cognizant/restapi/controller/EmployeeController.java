package com.cognizant.restapi.controller;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.cognizant.ormlearn.model.Department;
import com.cognizant.restapi.model.Employee;
import com.cognizant.restapi.service.EmployeeService;
import com.cognizant.restapi.service.SkillService;
//import com.cognizant.ormlearn.model.Skill;
import com.cognizant.restapi.model.Department;
import com.cognizant.restapi.model.Skill;
@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	@Autowired
	SkillService skillService;
	
	@PostConstruct
	public void init()
	{
		Department department=new Department("IT");
		Department department1=new Department("Java");
		Department department2=new Department("Python");
		Employee employee=new Employee("Harshdeep",18000,true,LocalDate.of(1997,10,13));
		employee.setDepartment(department);
		Set<Skill> skillSet=new HashSet<>(); 
		Skill skill=new Skill(1,"OOPS");
		Skill skill1=new Skill(2,"Cloud Computing");
		Skill skill2=new Skill(3,"MicroServices");
		skillService.save(skill);
		skillService.save(skill1);
		skillService.save(skill2);
		skillSet.add(skill);
		skillSet.add(skill2);
		employee.setSkillList(skillSet);
		Employee employee1=new Employee("Aditya",20000,true,LocalDate.of(1999,2,25));
		employee1.setDepartment(department1);
		Set<Skill> skillSet1=new HashSet<>();
		skillSet1.add(skill1);
		skillSet1.add(skill2);
		employee1.setSkillList(skillSet1);
		employeeService.save(employee);
		employeeService.save(employee1);
	}
	
	@GetMapping("/getemployee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getEmployeesByNative();
	}
	@PutMapping(consumes = "application/json",produces = "application/json" ,value="/updateemployee")
	public Employee modifyEmployee(@RequestBody Employee employee)
	{
		return employeeService.modifyEmployee(employee);
	}
	@DeleteMapping("/deleteemployee/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		return "Employee deleted";
	}
}
