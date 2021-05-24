package com.chainOfResponsibility;

public abstract class ILeaveRequestHandler 
{
	protected ILeaveRequestHandler nextHandler;
	public abstract void HandlerRequest(LeaveRequest leaveRequest);

}
