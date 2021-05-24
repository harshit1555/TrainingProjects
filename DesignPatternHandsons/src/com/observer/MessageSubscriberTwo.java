package com.observer;

public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(Message msg) {
		
		System.out.println("MessageSubscriberTwo :: " + msg.getMessageContent());
		
	}

}
