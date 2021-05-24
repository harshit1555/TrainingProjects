package com.cognizant.restapi.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.sun.istack.NotNull;
@Entity
@Table(name = "employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "em_id")
	@NotNull
	@Size(min = 1,max = 30,message = "Name should be between 1 to 30 character")
	 private int id;
	@Column(name = "em_name")
	 private String name;
	@Column(name = "em_salary")
	@NotNull
	@Size(min=0)	
	private double salary;
	@Column(name = "em_permanent")
	@NotNull
	 private boolean permanent;
	@Column(name = "em_date_of_birth")
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	 private LocalDate dateOfBirth;
	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "em_dp_id")
	private Department department;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "employee_skill",joinColumns = @JoinColumn(name="es_em_id"),inverseJoinColumns = @JoinColumn(name="es_sk_id"))
	private Set<Skill> skillList;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Set<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(Set<Skill> skillList) {
		this.skillList = skillList;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, double salary, boolean permanent, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.salary = salary;
		this.permanent = permanent;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
