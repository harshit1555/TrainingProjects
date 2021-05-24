package com.chain.handler;

import com.chain.leave.LeaveRequest;

public class ProjectManager implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = new HR();

	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() > 2 && leaveRequest.getLeaveDays() < 6) {
			System.out.println(leaveRequest.getEmployeeName() + " your leave request is accepted by ProjectManger");
		} else {
			System.out.println(leaveRequest.getEmployeeName()+" your leave request forwarded to HR");
			nextHandler.HandleRequest(leaveRequest);
		}

	}

}
