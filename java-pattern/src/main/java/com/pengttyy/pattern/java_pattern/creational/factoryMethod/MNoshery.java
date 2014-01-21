package com.pengttyy.pattern.java_pattern.creational.factoryMethod;

public class MNoshery extends Noshery {

	@Override
	public Snack create(String type) {
		if("LotusRootFriedMeat".equalsIgnoreCase(type)){
	    	return new MLotusRootFriedMeat();
	    }else if("StirFriedMeatAndPotatoes".equalsIgnoreCase(type)){
	    	return new MStirFriedMeatAndPotatoes();	
	    }else{
	    	throw new NullPointerException("未定义的类型！");
	    }
	}

}
