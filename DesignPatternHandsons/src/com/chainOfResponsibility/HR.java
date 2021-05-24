package com.chainOfResponsibility;

public class HR extends ILeaveRequestHandler
{

	@Override
	public void HandlerRequest(LeaveRequest leaveRequest) 
	{
		int leaveDays=leaveRequest.getLeaveDays();
		if(leaveDays>5) 
			System.out.println(leaveRequest.getEmployee()+" your leave is approved by HR");
		
	}


}
