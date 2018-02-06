package com.icl.tcs;

import java.util.Scanner;

class Manager extends Employee{
	String Department;
	
	
	public void getManagerDetails() { 
		getEmployeeDetails();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the deptment:");
	Department = sc.nextLine();
	}
	public void dispManagerDetails() {
		dispEmployeeDetails();
		System.out.println("Department : "+Department);
	}
	
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.getManagerDetails();
		m1.dispEmployeeDetails();
	}
		
}

