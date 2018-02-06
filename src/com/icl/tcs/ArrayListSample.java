package com.icl.tcs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(9);
		
		System.out.println("#1 normal for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("#2 advance for loop");
		
		for(Integer i : list) {
			System.out.println(i);
		}
		ArrayList<String> slist = new ArrayList<String>();
		
		slist.add("Hii");
		slist.add("Hello");
		slist.add("Welcome");
		
		System.out.println("#3 iterator");
		Iterator<String> iterator = slist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
	}

	}
}
