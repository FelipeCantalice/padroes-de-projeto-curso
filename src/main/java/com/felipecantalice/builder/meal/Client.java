package com.felipecantalice.builder.meal;

import com.felipecantalice.builder.meal.builder.FastFoodMealBuilder;
import com.felipecantalice.builder.meal.builder.FatMealBuilder;
import com.felipecantalice.builder.meal.builder.JustFriesBuilder;
import com.felipecantalice.builder.meal.builder.Menu1Builder;
import com.felipecantalice.builder.meal.builder.Menu2Builder;
import com.felipecantalice.builder.meal.director.MealDirector;

public class Client {
    public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}
