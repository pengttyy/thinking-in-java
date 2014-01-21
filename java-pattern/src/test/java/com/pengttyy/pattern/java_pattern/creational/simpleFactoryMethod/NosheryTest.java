package com.pengttyy.pattern.java_pattern.creational.simpleFactoryMethod;

import org.junit.Before;
import org.junit.Test;

import com.pengttyy.pattern.java_pattern.creational.simpleFactoryMethod.Noshery;
import com.pengttyy.pattern.java_pattern.creational.simpleFactoryMethod.SimpleNosheryFactory;

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
