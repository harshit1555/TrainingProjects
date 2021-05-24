package com.chain.handler;

import com.chain.leave.LeaveRequest;

public class Program {
	public static void main(String args[]){
		LeaveRequest leaveRequest=new LeaveRequest("Harshdeep",8);
		Supervisor supervisor=new Supervisor();
		supervisor.HandleRequest(leaveRequest);
		
	}

}
