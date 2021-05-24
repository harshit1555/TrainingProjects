package com.mediator;

public class Main {

	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		IUser iUser1 = new BasicUser("harshit");
		IUser iUser2 = new BasicUser("sushil");
		chatMediator.AddUser(iUser1);
		chatMediator.AddUser(iUser2);
		
		
		IUser pUser = new PremiumUser(chatMediator,"Rohit");		

		pUser.SendMessage("Hello!! how's you!");

	}

}
