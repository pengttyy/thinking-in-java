package com.pengttyy.pattern.java_pattern.creational.factoryMethod;

public class SimpleNosheryFactory {

	public Snack create(String type){
	    if("LotusRootFriedMeat".equalsIgnoreCase(type)){
	    	return new LotusRootFriedMeat();
	    }else if("StirFriedMeatAndPotatoes".equalsIgnoreCase(type)){
	    	return null;	
	    }else{
	    	throw new NullPointerException("未定义的类型！");
	    }
	}	

}
