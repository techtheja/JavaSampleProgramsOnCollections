package com.icl.tcs;

import java.util.Scanner;

class Employee extends Person{
	
	String Organization;
	int salary;
	
	public void getEmployeeDetails (){
		
		getDetails();
		
		System.out.println("Enter the details of porganization and the salary:");
		Scanner sc = new Scanner(System.in);
		Organization = sc.next();
		salary= sc.nextInt();
		
		
	}
	public void dispEmployeeDetails() {
		showDetails();
		System.out.println("Oragization : "+Organization);
		System.out.println("salary : "+salary);
		
	}
	
	
}