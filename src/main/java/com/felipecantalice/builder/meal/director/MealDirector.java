package com.felipecantalice.builder.meal.director;

import com.felipecantalice.builder.meal.builder.FastFoodMealBuilder;
import com.felipecantalice.builder.meal.model.FastFoodMeal;

public class MealDirector {
    
    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }  

    public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }
}
