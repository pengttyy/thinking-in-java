package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class MLotusRootFriedMeat extends Snack {
    
	private IMaterialFactory iMaterialFactory; 
	
	private String name;
	
	public MLotusRootFriedMeat(IMaterialFactory iMaterialFactory) {
		this.iMaterialFactory = iMaterialFactory;
		this.name = "M莲藕炒肉";
	}

	@Override
	public void prepare() {
		System.out.println(name+"正在配置原料！");
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
