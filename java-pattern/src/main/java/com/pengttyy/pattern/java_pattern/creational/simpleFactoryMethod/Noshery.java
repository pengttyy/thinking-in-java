package com.pengttyy.pattern.java_pattern.creational.simpleFactoryMethod;

public class Noshery {
	private SimpleNosheryFactory factory;
	
	public Noshery(SimpleNosheryFactory factory){
		this.factory = factory;
	}
	
	public void orderNoshery(String type){
		Snack snack = factory.create(type);
		snack.cutFood();
		snack.cookRice();
		snack.cooking();
	}
	
}
