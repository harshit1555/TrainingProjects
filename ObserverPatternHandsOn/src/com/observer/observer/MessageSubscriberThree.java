package com.observer.observer;

import com.observer.message.Message;

public class MessageSubscriberThree implements Observer {
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}

}