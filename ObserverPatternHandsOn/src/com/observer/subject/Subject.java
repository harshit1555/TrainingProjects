package com.observer.subject;

import com.observer.message.Message;
import com.observer.observer.Observer;

public interface Subject

{
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyUpdate(Message m);
}