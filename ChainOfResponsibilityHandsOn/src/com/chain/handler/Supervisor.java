package com.chain.handler;

import com.chain.leave.LeaveRequest;

public class Supervisor implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler=new ProjectManager() ;
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if(leaveRequest.getLeaveDays()>0 && leaveRequest.getLeaveDays()<3)
		{
			System.out.println(leaveRequest.getEmployeeName()+" your leave request is accepted by Supervisor");
		}
		else
		{
			System.out.println(leaveRequest.getEmployeeName()+" your leave request forwarded to ProjectManager");
			nextHandler.HandleRequest(leaveRequest);
		}
		
	}

}
