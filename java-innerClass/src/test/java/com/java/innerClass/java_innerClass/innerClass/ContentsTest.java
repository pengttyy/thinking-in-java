package com.java.innerClass.java_innerClass.innerClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContentsTest {

	@Test
	public void testContents() {
		Contents content = new Contents();
		Contents.ContentsInner ci = content.getContents();
		ci.setClassName();
	}

	@Test
	public void testGetInnerStr()
		throws Exception {
		Contents contents = new Contents();
		assertEquals("失败", "123", contents.getInnerStr());
	}
	
	

}
