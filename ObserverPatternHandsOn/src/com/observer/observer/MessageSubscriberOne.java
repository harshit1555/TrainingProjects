package com.observer.observer;

import com.observer.message.Message;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

}