package com.java.casestudy2;

public class Client
{
	public static void main(String[] args)
	{
		INotificationObserver steveObserver=new SteveObserver();
		INotificationObserver johnObserver=new JohnObserver();
		INotificationService service=new NotificationService();
		System.out.println("------------adding observers--------------");
		service.AddSubscriber(steveObserver);
		service.AddSubscriber(johnObserver);
		System.out.println("------------Notification--------------");
		service.NofitySubscriber();
		System.out.println("------------Remove observer--------------");
		service.RemoveSubscriber(johnObserver);
	}
}
