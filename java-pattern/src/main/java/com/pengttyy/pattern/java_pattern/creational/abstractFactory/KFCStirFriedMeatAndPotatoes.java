package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class KFCStirFriedMeatAndPotatoes extends Snack {
    
	private IMaterialFactory iMaterialFactory;
	
	private String name;
	
	public KFCStirFriedMeatAndPotatoes(IMaterialFactory iMaterialFactory) {
		super();
		this.iMaterialFactory = iMaterialFactory;
		this.name = "KFC土豆炒肉";
	}


	public void prepare() {
		iMaterialFactory.createRice();
		iMaterialFactory.createParts();
	}


	@Override
	public void cut() {
		System.out.println(name+"正在切！");
	}


	@Override
	public void cook() {
		System.out.println(name+"正在炒！");  		
	}

}
