package com.pengttyy.pattern.java_pattern.creational.factoryMethod;

import org.junit.Before;
import org.junit.Test;

public class KFCNosheryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrderNoshery() {
		Noshery kfcNoshery = new KFCNoshery();
		kfcNoshery.orderNoshery("LotusRootFriedMeat");
		Noshery mNoshery = new MNoshery();
		mNoshery.orderNoshery("LotusRootFriedMeat");
	}

}
