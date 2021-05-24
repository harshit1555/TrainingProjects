package com.mediator.chat;

import com.mediator.user.IUser;

public interface IChatMediator {
	public void AddUser(IUser user);
	public void SendMessage(String message);

}
