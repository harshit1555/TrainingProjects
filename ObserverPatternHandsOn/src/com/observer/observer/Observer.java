package com.observer.observer;

import com.observer.message.Message;

public interface Observer {
	public void update(Message m);
}
