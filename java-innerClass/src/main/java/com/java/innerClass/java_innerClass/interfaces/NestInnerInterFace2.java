package com.java.innerClass.java_innerClass.interfaces;

public interface NestInnerInterFace2 {
   void add();
   public static class InnerStaticClass2{
	   public InnerStaticClass2() {
		System.out.println("InnerStaticClass2");
	   }
	   
	   public static void getNestInterFaceImp(NestInnerInterFace2 nif){
		   nif.add();
	   }
   }
}
