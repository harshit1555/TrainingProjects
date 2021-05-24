package com.cognizant.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

//import com.sun.istack.NotNull;

@Entity
public class Country 
{
	@Id
	@NotNull
	@Min(value=2,message = "Code should be 2 characters")
	@Max(value=2,message = "Code should be 2 characters")
	private String code;
	private String name;
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
