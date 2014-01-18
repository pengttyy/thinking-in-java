package com.java.innerClass.java_innerClass.innerClass;

import com.java.innerClass.java_innerClass.innerClass.ExtendsInnerClass1.extendsClass1;

public class ExtendsInnerClass2{

	public class extendsClass2 extends extendsClass1{

		public extendsClass2(ExtendsInnerClass1 extendsInnerClass1, String str) {
			extendsInnerClass1.super(str);
			System.out.println("extendsClass2="+str);
		}
		
	}
	
	public extendsClass1 getExtendsClass(){
		return new extendsClass2(new ExtendsInnerClass1(),"pengttyy"); 
	}

}
