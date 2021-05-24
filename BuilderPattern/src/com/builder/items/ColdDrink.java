package com.builder.items;

import com.builder.imple.Bottle;
import com.builder.inter.Item;
import com.builder.inter.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
