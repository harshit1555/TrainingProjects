package com.builder.items;

import com.builder.imple.Wrapper;
import com.builder.inter.Item;
import com.builder.inter.Packing;

public abstract class Burger implements Item {

	@Override

	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}