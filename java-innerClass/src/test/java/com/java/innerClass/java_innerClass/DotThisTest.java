package com.java.innerClass.java_innerClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class DotThisTest {

	@Test
	public void testGetDotThis() {
		DotThis dt = new DotThis();
		DotThis.Inner innerObj = dt.new Inner();
		assertEquals("比较失败", dt, innerObj.getDotThis());
	}

}
