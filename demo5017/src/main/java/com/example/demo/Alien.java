package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien
{
 public Alien() {
		super();
		System.out.println("Object Created");
		// TODO Auto-generated constructor stub
	}
private int aId;
 private String aName;
 private String tech;
 @Autowired
 private Laptop aLaptop;
public Laptop getaLaptop() {
	return aLaptop;
}
public void setaLaptop(Laptop aLaptop) {
	this.aLaptop = aLaptop;
}
public int getaId() {
	return aId;
}
public void setaId(int aId) {
	this.aId = aId;
}
public String getaName() {
	return aName;
}
public void setaName(String aName) {
	this.aName = aName;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public void show()
{
	System.out.println("Hey Aliens");
	aLaptop.compile(); 
	}
}
