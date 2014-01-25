package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public abstract class Noshery {

	protected abstract Snack createNoshery(String type);
	
	public void orderNoshery(String type){
		Snack snack = createNoshery(type);
		snack.prepare();
		snack.cut();
		snack.cut();
	}
	
}
