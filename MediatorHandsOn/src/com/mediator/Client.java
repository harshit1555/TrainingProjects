package com.mediator;

import com.mediator.chat.ChatMediator;
import com.mediator.user.BasicUser;
import com.mediator.user.IUser;
import com.mediator.user.PremiumUser;

public class Client {
	public static void main(String args[]) {
		ChatMediator chatMediator = new ChatMediator();
		IUser user1 = new BasicUser("Aakash", chatMediator);
		IUser user2 = new BasicUser("Abhishek", chatMediator);
		IUser user3 = new PremiumUser("Harsh", chatMediator);
		IUser user4 = new BasicUser("Harshit", chatMediator);
		IUser user5 = new BasicUser("Aditya", chatMediator);
		IUser user6 = new PremiumUser("Mudit", chatMediator);
		chatMediator.AddUser(user1);
		chatMediator.AddUser(user2);
		chatMediator.AddUser(user3);
		chatMediator.AddUser(user4);
		chatMediator.AddUser(user5);
		chatMediator.AddUser(user6);
		IUser user7 = new PremiumUser("HarshDeep", chatMediator);
		user7.SendMessage("Halo");

	}
}
