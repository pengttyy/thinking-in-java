package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KFCNosheryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrderNoshery() {
		KFCNoshery kn = new KFCNoshery();
		kn.orderNoshery("LotusRootFriedMeat");
	}

}
 