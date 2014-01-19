package com.pengttyy.pattern.java_pattern.creational.factoryMethod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NosheryTest {
    
	private Noshery noshery;
	
	@Before
	public void setUp() throws Exception { 
		noshery = new Noshery(new SimpleNosheryFactory());
	}

	@Test
	public void testOrderNoshery() {
		noshery.orderNoshery("LotusRootFriedMeat");
	}

}
