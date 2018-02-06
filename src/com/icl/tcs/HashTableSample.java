package com.icl.tcs;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
	
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		  
		  Set<Integer> keys = hm.keySet();
		  Collection<String> values = hm.values();
		  
		  for(Integer i : keys) {
			  System.out.println(i);
		  }
		  for(String i : values) {
			  System.out.println(i);
		  }
	}

}
