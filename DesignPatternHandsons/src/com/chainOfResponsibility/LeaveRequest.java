package com.chainOfResponsibility;

public class LeaveRequest 
{
	private String employee;
	private int leaveDays;
	
	public LeaveRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LeaveRequest(String employee, int leaveDays) {
		super();
		this.employee = employee;
		this.leaveDays = leaveDays;
	}

	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	

}
