package com.java.holdAReference;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class MyLinedList {     
	private List<Integer> list;
	public MyLinedList() {
		this.list = new LinkedList<Integer>();
	}
	
	public void addList(Integer i){
		ListIterator<Integer> it = list.listIterator(0);
		it.add(i);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		MyLinedList ml = new MyLinedList();
		ml.addList(1);
		ml.addList(2);
		ml.addList(3 );
	}

}
