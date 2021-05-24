package com.builder.items;

public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}

}
