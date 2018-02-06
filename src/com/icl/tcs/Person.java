package com.icl.tcs;

import java.util.Scanner;

public class Person {

	
	String name; 
	int  age; 
	String nationality;
	
	public void getDetails() {
		System.out.println("Enter the person details (name,age,nationality");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		age = sc.nextInt();
		nationality = sc.next();
	}
	
	public void showDetails() {
		System.out.println("Details of the person: ");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Nationality : "+nationality);
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person p1 = new Person();
//		p1.getDetails();
//		p1.showDetails();
//	}
	
}