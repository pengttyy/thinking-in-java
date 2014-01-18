package com.java.innerClass.java_innerClass;
/**
 * .this .new 用法
 * @author pengkaiPC
 *
 */
public class DotThis {
	public class Inner{
		public Inner() {
			System.out.println("this is Inner");
		}
		
		public DotThis getDotThis(){
			return DotThis.this;
		}
	}
	
	public String toString(){
		return "this is DotThis";
	}
}
