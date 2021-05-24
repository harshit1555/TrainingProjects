package com.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator
{
	List<IUser> users= new ArrayList<>();
	public ChatMediator() 
	{

	}
	@Override
	public void AddUser(IUser user) {
		users.add(user);

	}

	@Override
	public void SendMessage(String msg) {
		users.forEach(u->u.ReceiveMessage(msg));
	}

}
