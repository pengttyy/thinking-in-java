package com.java.holdAReference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListTest {
    private List<Gerbil> list;
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<Gerbil>();
	}

	@Test
	public void testAdd() {
		Gerbil gerbil = new Gerbil();
		list.add(gerbil);
		assertEquals(gerbil, list.get(0));
	}
	
	@Test
	public void testAddIndex(){
		Gerbil gerbil0 = new Gerbil();
		Gerbil gerbil1 = new Gerbil();
		Gerbil gerbil2 = new Gerbil();
		Gerbil gerbil3 = new Gerbil();
		list.add(gerbil0);
		list.add(gerbil1);
		list.add(gerbil2);
		
		List list2 = new ArrayList();
		list2.add(gerbil1);
		list2.add(gerbil0);
	    //list2.add(gerbil3);
		
		assertTrue(list.containsAll(list2));
	}

}
