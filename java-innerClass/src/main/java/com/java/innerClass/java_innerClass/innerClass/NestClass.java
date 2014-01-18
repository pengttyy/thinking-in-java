package com.java.innerClass.java_innerClass.innerClass;
/**
 * 嵌套类
 * @author pengkaiPC
 *
 */
public class NestClass {
   public static class NestInnerClass{
	   public NestInnerClass() {
		System.out.println("NestInnerClass");
	}
   }
   public static void main(String[] args) {
	NestInnerClass nc = new NestInnerClass();
}
}
