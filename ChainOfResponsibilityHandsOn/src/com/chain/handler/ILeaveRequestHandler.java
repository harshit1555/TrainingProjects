package com.chain.handler;

import com.chain.leave.LeaveRequest;

public interface ILeaveRequestHandler {
	public static final ILeaveRequestHandler nextHandler = null;
	public void HandleRequest(LeaveRequest leaveRequest);
	
}
