package com.icl.tcs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("");
		  al.add("Ajay");  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println(al);
	}

}
