package com.pengttyy.pattern.java_pattern.creational.factoryMethod;

import com.pengttyy.pattern.java_pattern.creational.factoryMethod.KFCLotusRootFriedMeat;

public class KFCNoshery extends Noshery {

	@Override
	public Snack create(String type) {
		if("LotusRootFriedMeat".equalsIgnoreCase(type)){
	    	return new KFCLotusRootFriedMeat();
	    }else if("StirFriedMeatAndPotatoes".equalsIgnoreCase(type)){
	    	return new KFCStirFriedMeatAndPotatoes();	
	    }else{
	    	throw new NullPointerException("未定义的类型！");
	    }
	}

}
