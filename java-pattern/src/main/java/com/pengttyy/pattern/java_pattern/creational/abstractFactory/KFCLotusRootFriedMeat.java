package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class KFCLotusRootFriedMeat extends Snack{
	
    private IMaterialFactory iMaterialFactory;
    
    private String name;
	
	public KFCLotusRootFriedMeat(IMaterialFactory iMaterialFactory) {
		super();
		this.iMaterialFactory = iMaterialFactory;
		this.name = "KFC莲藕炒肉";
	}


	public void prepare() {
		rice = iMaterialFactory.createRice();
		parts = iMaterialFactory.createParts();
	}


	@Override
	public void cut() {
		System.out.println(name+":正在切");
	}


	@Override
	public void cook() {
		System.out.println(name+":正在炒");
	}
	
}
