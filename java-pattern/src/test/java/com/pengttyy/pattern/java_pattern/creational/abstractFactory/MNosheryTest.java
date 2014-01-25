package com.pengttyy.pattern.java_pattern.creational.abstractFactory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MNosheryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrderNoshery() {
	    MNoshery mnoshery = new MNoshery();
	    mnoshery.orderNoshery("LotusRootFriedMeat");
	}

}
