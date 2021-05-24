package com.cognizant.h2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ABC
{
	@Id
	private int id;
	private String name;
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
	public ABC(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ABC() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
