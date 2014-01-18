package com.java.holdAReference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.java.holdAReference.*;
import org.junit.Before;
import org.junit.Test;

public class MyListIteratorTest {
    private List<Integer> list;
	@Before
	public void setUp() throws Exception {
		list = Arrays.asList(1,2,3);
	}

	@Test
	public void testReverseList() {
		MyListIterator myListIterator = new MyListIterator(list);
		List<Integer> templist = myListIterator.reverseList();
		assertEquals(Arrays.asList(1,2,3).get(2),templist.get(0));
	}
	
	/**
	 * 反向遍历时要将listIterator指向最后一个元素
	 */
	@Test
	public void testReverseList2() {
		MyListIterator myListIterator = new MyListIterator(list);
		List<Integer> templist = myListIterator.reverseList2();
		assertEquals(Arrays.asList(1,2,3).get(2),templist.get(0));
	}

}
