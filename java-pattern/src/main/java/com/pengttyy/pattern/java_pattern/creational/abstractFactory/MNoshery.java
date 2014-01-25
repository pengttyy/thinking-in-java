package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class MNoshery extends Noshery {

	@Override
	protected Snack createNoshery(String type) {
		IMaterialFactory iMaterialFactory = new MFactory();
		if("LotusRootFriedMeat".equalsIgnoreCase(type)){
	    	return new MLotusRootFriedMeat(iMaterialFactory);
	    }else if("StirFriedMeatAndPotatoes".equalsIgnoreCase(type)){
	    	return null;	
	    }else{
	    	throw new NullPointerException("未定义的类型！");
	    }		
	}

}
