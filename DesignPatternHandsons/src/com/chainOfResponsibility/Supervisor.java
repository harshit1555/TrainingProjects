package com.chainOfResponsibility;

public class Supervisor extends ILeaveRequestHandler {

	@Override
	public void HandlerRequest(LeaveRequest leaveRequest) 
	{
		int leaveDays=leaveRequest.getLeaveDays();
		if(leaveDays>0 && leaveDays<=3) 
			System.out.println(leaveRequest.getEmployee()+" your leave is approved by Supervisor");
		else if(leaveDays>3)
		{
			nextHandler=new ProjectManager();
			System.out.println(leaveRequest.getEmployee()+" your request is forwarded to ProjectManager");
			nextHandler.HandlerRequest(leaveRequest);
		}
		
	}

}
