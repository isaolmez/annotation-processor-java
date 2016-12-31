package com.isa.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(MealContainer.class)
public @interface Meal {
	String value();

	boolean salty();

}
