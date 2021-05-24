package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop 
{
	private int lId;
	private String lBrand;
	public void compile()
	{
		System.out.println("Program is compiling");
	}
	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lBrand=" + lBrand + "]";
	}
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlBrand() {
		return lBrand;
	}
	public void setlBrand(String lBrand) {
		this.lBrand = lBrand;
	}
	

}
