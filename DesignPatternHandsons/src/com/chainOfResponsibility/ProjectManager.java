package com.chainOfResponsibility;

public class ProjectManager extends ILeaveRequestHandler {

	@Override
	public void HandlerRequest(LeaveRequest leaveRequest) 
	{
		int leaveDays=leaveRequest.getLeaveDays();
		if(leaveDays>3 && leaveDays<=5) 
			System.out.println(leaveRequest.getEmployee()+" your leave is approved by Project Manager");
		else if(leaveDays>5 )
		{
			nextHandler=new HR();
			System.out.println(leaveRequest.getEmployee()+" your request is forwarded to HR");
			nextHandler.HandlerRequest(leaveRequest);

		}

		
	}

}
