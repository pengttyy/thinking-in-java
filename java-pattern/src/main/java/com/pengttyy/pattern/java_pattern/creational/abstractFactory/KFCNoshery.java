package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class KFCNoshery extends Noshery {

	@Override
	protected Snack createNoshery(String type) {
		if("LotusRootFriedMeat".equalsIgnoreCase(type)){
	    	return new KFCLotusRootFriedMeat(new KFCFactory());
	    }else if("StirFriedMeatAndPotatoes".equalsIgnoreCase(type)){
	    	return new KFCStirFriedMeatAndPotatoes(new KFCFactory());	
	    }else{
	    	throw new NullPointerException("未定义的类型！");
	    }		
	}

}
