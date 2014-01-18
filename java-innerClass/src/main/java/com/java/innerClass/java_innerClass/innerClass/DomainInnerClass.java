package com.java.innerClass.java_innerClass.innerClass;

import com.java.innerClass.java_innerClass.interfaces.Destination;
/**
 * 作用域中的内部类
 * @author pengkaiPC
 *
 */
public class DomainInnerClass {
	   
	public Destination getDestination(boolean flag){
		if(flag){
			class DestinationImp implements Destination{
				public void add() {
					System.out.println("out MethodInnerClass add");
				}
			}
			return new DestinationImp();	
		}else{
			return null;
		}
	}
}
