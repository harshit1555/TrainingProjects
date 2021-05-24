package com.observer;

public class Main {

	public static void main(String[] args)
	{

		MessageSubscriberOne message1 = new MessageSubscriberOne();

		MessageSubscriberTwo message2 = new MessageSubscriberTwo();

		MessageSubscriberThree message3= new MessageSubscriberThree();

		MessagePublisher publisher = new MessagePublisher();

		publisher.attach(message1);

		publisher.attach(message2);

		publisher.notifyUpdate(new Message("First Message")); 

		publisher.detach(message1);

		publisher.attach(message3);

		publisher.notifyUpdate(new Message("Second Message")); 

	}

}
