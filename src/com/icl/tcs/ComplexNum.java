package com.icl.tcs;

import java.util.Scanner;

public class ComplexNum {

		int x,y;
		public void getNumbers() {
			System.out.println("Enter the complex number:");
			Scanner sc  =new Scanner(System.in);
			x = sc.nextInt();
			y = sc.nextInt();
		}
		public void multiply(ComplexNum c1, ComplexNum c2) {
			
			
			
		}
		
		public void show() {
			System.out.println("c1:"+ x +"+i"+y);
		}
	
	public static void main(String[] args) {
		ComplexNum c1 = new ComplexNum();
		ComplexNum c2 = new ComplexNum();
		c1.getNumbers();
		c1.show();
		c2.getNumbers();
		//c1.multiply(c1, c2);
		
	}

}
