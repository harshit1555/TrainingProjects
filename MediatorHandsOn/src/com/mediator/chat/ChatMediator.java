package com.mediator.chat;

import java.util.ArrayList;
import java.util.List;

import com.mediator.user.IUser;

public class ChatMediator implements IChatMediator {

	public List<IUser> users;
	public ChatMediator()
	{
		users=new ArrayList<IUser>();
	}
	public List<IUser> getUserList()
	{
		return this.users;
	}
	@Override
	public void AddUser(IUser user) {
		users.add(user);
	} 

	@Override
	public void SendMessage(String message) {
		for(IUser i:users)
		{
			i.ReceviedMessage(message);
		}
		
	}

}
