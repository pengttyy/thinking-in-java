package com.java.innerClass.java_innerClass.innerClass;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.innerClass.java_innerClass.interfaces.Destination;

public class DomainAnonymousInnerClassTest {

	@Test
	public void testGetDestination_ok() {
		DomainAnonymousInnerClass dic = new DomainAnonymousInnerClass();
		Destination destObj = dic.getDestination(true,"ok");
		assertEquals(Destination.class, destObj.getClass().getInterfaces()[0]);
	}
	
	@Test
	public void testGetDestination_no(){
		DomainAnonymousInnerClass dic = new DomainAnonymousInnerClass();
		Destination destObj = dic.getDestination(false,"no");
		assertEquals(null, destObj);
	}

}
