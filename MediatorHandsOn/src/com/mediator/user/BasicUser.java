package com.mediator.user;

import com.mediator.chat.ChatMediator;

public class BasicUser implements IUser{

	public String name;
	public ChatMediator chatMediator;
	public BasicUser(String name, ChatMediator chatMediator)
	{
		this.name=name;
		this.chatMediator=chatMediator;
	}
	@Override
	public void ReceviedMessage(String message) {
		System.out.println(name+" "+message);
	}

	@Override
	public void SendMessage(String message) {
		this.chatMediator.SendMessage(message);
		
	}

}
