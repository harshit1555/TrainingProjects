package com.java.casestudy2;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService 
{
	List<INotificationObserver> list=new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver iNotificationObserver)
	{
		// TODO Auto-generated method stub
		list.add(iNotificationObserver);
		System.out.println(list);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver iNotificationObserver)
	{
		// TODO Auto-generated method stub
		list.remove(iNotificationObserver);
		System.out.println(list);
	}

	@Override
	public void NofitySubscriber() 
	{
		// TODO Auto-generated method stub
		for(INotificationObserver iNotificationObserver:list)
		{
			iNotificationObserver.OnServerDown();
		}

	}

}
