package com.java.innerClass.java_innerClass.innerClass;

import static org.junit.Assert.*;

import org.junit.Test;


import com.java.innerClass.java_innerClass.interfaces.Destination;

public class MethodInnerClassTest {

	@Test
	public void testGetDestination() {
		MethodInnerClass mic = new MethodInnerClass();
		Destination destObj = mic.getDestination();
		destObj.add();
	}

}
