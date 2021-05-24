package com.mediator;

public class BasicUser implements IUser
{
	private IChatMediator chatMediator;
	private String name;

	public BasicUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasicUser(String name)
	{
		super();
		this.name=name;
	}

	public IChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Message : "+msg+" received by: " + name);
	}

	@Override
	public void SendMessage(String msg) {
		// TODO Auto-generated method stub
		chatMediator.SendMessage(msg);

	}

}
