package com.icl.tcs;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> al=new TreeSet<Integer>();  
		 // al.add("A");  
		  al.add(1);  
		//  al.add("a");  
		  al.add(0);  
		//  al.add("a"); 
		  //Traversing elements  
		  Iterator<Integer> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  System.out.println(al);
	}

}
