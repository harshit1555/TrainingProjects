package com.cognizant.restapi.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dp_id")
	private int id;
	@Column(name = "dp_name")
	private String name;
	@JsonBackReference
	@OneToMany(mappedBy = "department",fetch = FetchType.EAGER)
	private Set<Employee> employeeList;
	
	public Department( String name) {
		super();
		
		this.name = name;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}
