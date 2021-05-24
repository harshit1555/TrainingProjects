package com.observer.observer;

import com.observer.message.Message;

public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
	}

}