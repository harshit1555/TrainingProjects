package com.cognizant.restapi.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	private String name;
	@OneToMany(mappedBy = "department",fetch = FetchType.EAGER)
	private Set<Employee> employeeList;
	public int getId() {
		return departmentId;
	}
	public void setId(int id) {
		this.departmentId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	public Department(int departmentId, String name) 
	{
		super();
		this.departmentId = departmentId;
		this.name = name;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [id=" + departmentId + ", name=" + name + "]";
	}
	
}
