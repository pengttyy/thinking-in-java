package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

public class KFCFactory implements IMaterialFactory {

	public Rice createRice() {
		return new KFCRice();
	}

	public Parts createParts() {
		return new KFCParts();
	}

}
