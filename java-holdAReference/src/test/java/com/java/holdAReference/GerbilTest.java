package com.java.holdAReference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GerbilTest {
    private List list;
	@Before
	public void setUp() throws Exception {
		Gerbil gerbil1 = new Gerbil();
        Gerbil gerbil2 = new Gerbil();
        Gerbil gerbil3 = new Gerbil();
        Gerbil gerbil4 = new Gerbil();
        list = new ArrayList();
        list.add(gerbil1);
        list.add(gerbil2);
        list.add(gerbil3);
        list.add(gerbil4);
	}
	@Test
	public void testList() {
		System.out.println(list);
       Iterator it =  list.iterator();
       while(it.hasNext()){
    	   Gerbil gerbil = (Gerbil)it.next();
    	   System.out.println(gerbil.hop());
       }
	}
	
	@Test
	public void testNull(){
		list = new ArrayList();
		for (Object listObj : list) {
			System.out.println("============");
			System.out.println(listObj);
		}
	}
	@Test
	public void testEmptyList(){
		List<String> list = Collections.emptyList();
		for (String obj : list) {
			System.out.println("pengkai");
		}
	}

}
