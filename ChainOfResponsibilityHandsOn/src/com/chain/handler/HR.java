package com.chain.handler;

import com.chain.leave.LeaveRequest;

public class HR implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler =null;

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		
			System.out.println(leaveRequest.getEmployeeName() + " your leave request is accepted by HR");

	}

}
