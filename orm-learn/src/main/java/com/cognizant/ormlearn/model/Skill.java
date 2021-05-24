package com.cognizant.ormlearn.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Skill 
{
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sk_id")
	private int id;
	@Column(name = "sk_name")
	private String name;
	@ManyToMany(mappedBy = "skillList")
	private Set<Employee> employeeList;
	
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
	
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	
}
