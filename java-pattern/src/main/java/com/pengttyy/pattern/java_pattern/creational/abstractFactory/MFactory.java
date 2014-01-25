package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class MFactory implements IMaterialFactory {

	public Rice createRice() {
		return new MRice();
	}

	public Parts createParts() {
		// TODO Auto-generated method stub
		return new MParts();
	}

	

}
