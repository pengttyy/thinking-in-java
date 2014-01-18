package com.java.innerClass.java_innerClass.innerClass;
/**
 * 方法内的内部类
 */
import com.java.innerClass.java_innerClass.interfaces.Destination;

public class MethodInnerClass {
   
	public Destination getDestination(){
		class DestinationImp implements Destination{
			public void add() {
				System.out.println("out MethodInnerClass add");
			}
		}
		return new DestinationImp();
	}
}
