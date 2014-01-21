package com.pengttyy.pattern.java_pattern.creational.factoryMethod;

public abstract class Noshery {

	protected final void orderNoshery(String type){
		Snack snack = create(type);
		snack.cutFood();
		snack.cookRice();
		snack.cooking();
	}
	
	protected abstract Snack create(String type);
	
}
