package com.isa.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Meals.class)
public @interface Meal {
	String value();

	boolean salty();

}
