package com.java.innerClass.java_innerClass;

public class Outer {

    public class Inner{
    	Inner(){
    		System.out.println("Inner Class");
    	}
    }
    
    public Inner getInner(){
    	return new Inner();
    }
}
