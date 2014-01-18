package com.java.innerClass.java_innerClass.innerClass;

import com.java.innerClass.java_innerClass.interfaces.NestInnerInterFace2;

public class NestInnerInterFaceImp2 implements NestInnerInterFace2 {

	public void add() {
		System.out.println("NestInnerInterFaceImp2 add"); 
	}
	
	public static void main(String[] args) {
		InnerStaticClass2 isc = new InnerStaticClass2();
		isc.getNestInterFaceImp(new NestInnerInterFaceImp2());
	}

}
