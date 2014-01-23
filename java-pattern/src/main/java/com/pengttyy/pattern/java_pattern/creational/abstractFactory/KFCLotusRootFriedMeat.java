package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class KFCLotusRootFriedMeat extends Snack{
	
    IMaterialFactory iMaterialFactory;
	
	public KFCLotusRootFriedMeat(IMaterialFactory iMaterialFactory) {
		super();
		this.iMaterialFactory = iMaterialFactory;
	}


	public void prepare() {
		rice = iMaterialFactory.createRice();
		parts = iMaterialFactory.createParts();
	}
	
}
