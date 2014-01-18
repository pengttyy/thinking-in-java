package com.java.holdAReference;

import java.util.ArrayList;
import java.util.List;

public class SubList {
	private List list;
    public SubList(String ...strings) {
		list = new ArrayList();
		for (String string : strings) {
			list.add(string);
		}
	}
	public List getList() {
		return list;
	}
	
	public List getSubList(int start,int end){
		return list.subList(start, end);
	}
   
}
