package com.observer.main;

import com.observer.message.Message;
import com.observer.observer.MessageSubscriberOne;
import com.observer.observer.MessageSubscriberThree;
import com.observer.observer.MessageSubscriberTwo;
import com.observer.subject.MessagePublisher;

public class Main

{
	public static void main(String[] args)
	{
		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		MessagePublisher p = new MessagePublisher();
		p.attach(s1);
		p.attach(s2);
		p.notifyUpdate(new Message("First Message"));
		p.detach(s1);
		p.attach(s3);
		p.notifyUpdate(new Message("Second Message"));
	}

}