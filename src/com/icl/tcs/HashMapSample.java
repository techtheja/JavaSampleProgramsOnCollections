package com.icl.tcs;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();           
		map.put(101,"Let us C");  
		map.put(103, "Operating System");  
		map.put(102, "Data Communication and Networking");  
		System.out.println("Values before remove: "+ map);    
		// Remove value for key 102  
		map.remove(102);  
		System.out.println("Values after remove: "+ map);  
		
		System.out.println("Sample "+map.get(103));
                   
	}

}
