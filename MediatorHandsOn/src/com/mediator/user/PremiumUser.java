package com.mediator.user;

import com.mediator.chat.ChatMediator;

public class PremiumUser implements IUser {

	public String name;
	public ChatMediator chatMediator;

	public PremiumUser(String name, ChatMediator chatMediator) {
		this.chatMediator=chatMediator;
		this.name=name;
	}

	@Override
	public void ReceviedMessage(String message) {
		System.out.println(name+" "+message);

	}

	@Override
	public void SendMessage(String message) {
		chatMediator.SendMessage(message);

	}

}