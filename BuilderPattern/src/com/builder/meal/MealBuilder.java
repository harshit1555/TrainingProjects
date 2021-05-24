package com.builder.meal;

import com.builder.items.ChickenBurger;
import com.builder.items.Coke;
import com.builder.items.Pepsi;
import com.builder.items.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;

	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;

	}
}
