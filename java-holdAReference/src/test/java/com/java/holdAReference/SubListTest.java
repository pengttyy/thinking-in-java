package com.java.holdAReference;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import  com.java.holdAReference.SubList;

public class SubListTest {
    private SubList sublist;
	@Before
	public void setUp() throws Exception {
		String [] initList = {"pengkai0","pengkai1","pengkai2","pengkai3"};
		sublist = new SubList(initList);
	}

	@Test
	public void testGetList() {
		List list = sublist.getList();
		System.out.println(list);
		assertNotNull(list);
	}
	@Test
    public void testGetSubList(){
		List list = sublist.getSubList(0,2);
		System.out.println(list);
		assertNotNull(list);
    }
	@Test
	public void testRemoveList(){
		List list = sublist.getList();
		List subList = sublist.getSubList(0,2);
		list.removeAll(subList);
		System.out.println(list);
	}

}
