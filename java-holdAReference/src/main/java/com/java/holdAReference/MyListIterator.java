package com.java.holdAReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class MyListIterator {
    private List<Integer> entryList;
    private List<Integer> tempList;
	public MyListIterator(List<Integer> list) {
		System.out.println(list);
		this.entryList = list;
	}
	public List<Integer> reverseList(){
		tempList = new ArrayList<Integer>();
		extracted();
		tempList.addAll(entryList);
		return this.tempList;
	}
	private void extracted() {
		Collections.sort(entryList,new Comparator<Object>(){
			@Override
			public int compare(final Object o1, final Object o2) {
				final Integer t1 = (Integer)o1;
				final Integer t2 = (Integer)o2;
				if(t1==t2){
					return 0;
				}else if(t1>t2){
					return -1;
				}
				return 1;
			}
			
		});
	}
	
	public List<Integer> reverseList2(){
		this.tempList = new ArrayList<Integer>();
		ListIterator<Integer> testIt = this.entryList.listIterator(this.entryList.size());
		for (; testIt.hasPrevious();) {
			tempList.add(testIt.previous());
		}
		return tempList;
	}

}
