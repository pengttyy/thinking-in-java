package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class KFCStirFriedMeatAndPotatoes extends Snack {
    
	IMaterialFactory iMaterialFactory;
	
	public KFCStirFriedMeatAndPotatoes(IMaterialFactory iMaterialFactory) {
		super();
		this.iMaterialFactory = iMaterialFactory;
	}


	public void prepare() {
		iMaterialFactory.createRice();
		iMaterialFactory.createParts();
	}

}
