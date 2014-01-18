package com.java.innerClass.java_innerClass.innerClass;

import com.java.innerClass.java_innerClass.interfaces.NestInnerInterFace;

public class NestInnerInterFaceImp implements NestInnerInterFace {

	public void add() {
		System.out.println("add"); 
	}
	
	public static void main(String[] args) {
		InnerStaticClass isc = new InnerStaticClass();
	}

}
