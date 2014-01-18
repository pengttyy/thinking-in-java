package com.java.innerClass.java_innerClass.innerClass;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.innerClass.java_innerClass.interfaces.Destination;

public class DomainInnerClassTest {

	@Test
	public void testGetDestination_ok() {
		DomainInnerClass dic = new DomainInnerClass();
		Destination destObj = dic.getDestination(true);
		assertEquals(Destination.class, destObj.getClass().getInterfaces()[0]);
	}
	
	@Test
	public void testGetDestination_no(){
		DomainInnerClass dic = new DomainInnerClass();
		Destination destObj = dic.getDestination(false);
		assertEquals(null, destObj);
	}

}
