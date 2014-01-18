package com.java.innerClass.java_innerClass;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.innerClass.java_innerClass.Outer.Inner;

public class OuterTest {

	@Test
	public void testGetInner() {
		Outer outer = new Outer();
		Outer.Inner innerObj = outer.getInner();
	}
	
	@Test
	public void testInnerInstantiation(){
		Outer outer = new Outer();
		Outer.Inner innerObj = outer.new Inner();
	}

	@Test
	public void testOuter()
		throws Exception {
		Outer outer = new Outer();
		
	}

	@Test
	public void testOuter_2()
		throws Exception {
		Outer outer = new Outer();
		
	}
}
