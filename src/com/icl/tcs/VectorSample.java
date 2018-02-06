package com.icl.tcs;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> month = new Vector<String>();
		month.add("Jan");
		month.add("Feb");
		month.add("Mar");
		System.out.println(month);
//		ArrayList<String> 
		Enumeration<String> allmonths = month.elements();
		
		while (allmonths.hasMoreElements()) {
			String string = (String) allmonths.nextElement();
			System.out.println(string);
		}
//		ArrayList sampleList = new ArrayList();
//		sampleList.add("SIT");
//		sampleList.add(123);
//		sampleList.addAll(month);
//		System.out.println("Output :");
//		Iterator iterator = sampleList.iterator();
//		while (iterator.hasNext()) {
//			Object values = (Object) iterator.next();
//			
//			System.out.println(values);
//		}
	}

}
