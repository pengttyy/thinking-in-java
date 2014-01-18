package com.java.innerClass.java_innerClass.innerClass;

import com.java.innerClass.java_innerClass.interfaces.Destination;
/**
 * 方法内的匿名内部类
 * @author pengkaiPC
 *
 */
public class MethodAnonymousInnerClass {
   
	public Destination getDestination(){
		return new Destination(){
			public void add() {
			   System.out.println("MethodAnonymousInnerClass");
			}
		};
	}
}
