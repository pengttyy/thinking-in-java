package com.java.innerClass.java_innerClass.innerClass;

import com.java.innerClass.java_innerClass.interfaces.Destination;
/**
 * 作用域内的匿名类
 * @author pengkaiPC
 *
 */
public class DomainAnonymousInnerClass {
	
	public Destination getDestination(boolean flag,final String text){
		if(flag){
			return new Destination(){
				public void add() {
					System.out.println(text);
				}
			};	
		}else{
			return null;
		}
	}

}
