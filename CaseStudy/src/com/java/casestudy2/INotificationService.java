package com.java.casestudy2;

public interface INotificationService
{
	public void AddSubscriber(INotificationObserver iNotificationObserver);
	public void RemoveSubscriber(INotificationObserver iNotificationObserver);
	public void NofitySubscriber();
}
