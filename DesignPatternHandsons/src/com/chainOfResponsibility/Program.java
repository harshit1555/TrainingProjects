package com.chainOfResponsibility;

public class Program {

	public static void main(String[] args) 
	{
		Supervisor supervisor=new Supervisor();
		
		LeaveRequest leaveRequest=new LeaveRequest("Harshit",8);
		supervisor.HandlerRequest(leaveRequest);
		LeaveRequest leaveRequest2=new LeaveRequest("Sushil",6);
		supervisor.HandlerRequest(leaveRequest2);

		
	}

}
