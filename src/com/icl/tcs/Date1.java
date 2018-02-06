package com.icl.tcs;

import java.util.Calendar;
import java.util.Scanner;

public class Date1 {
	
	int w, m,d,y;
	String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
	String month[] = {"Jan" , "Feb", "Mar" , "April" , "May" , "June" ,"July","Aug","Sept" , "oct" ,"Nov" ,"Dec"};
	
	Date1(){
		
	}
	public Date1(int m, int d, int y) {
	
		this.m = m;
		this.d = d;
		this.y = y;
		
		w = dayofweek(d,m,y);
		
	}
	
	 public int dayofweek(int day, int mon, int year)
	 {
	     int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
	     if(mon < 3)
	    	 year=year-1;
	     return ( year + year/4 - year/100 + year/400 + t[mon-1] + day) % 7;
	 }
	 
	public void getDate() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mm/dd/yyyy :");
		m = sc.nextInt();
		d = sc.nextInt();
		y = sc.nextInt();
		
		w = dayofweek(d,m,y);
		
		ShowDate();	
	}
	
	
	public void ShowDate() {
		
		System.out.println("Show date (ww mm dd yyyy): "+ week[w] +"  "+ (String) month[m-1]+ " "+ d +" "+y);
		
	}
	public boolean compareDate(Date1 d2) {
		
		if(this.m != d2.m) {
			return false;
		}
		if(this.d != d2.d) {
			return false;
		}
		if(this.y != d2.y) {
			return false;
		}
		
		return true;
	}
	
	

	public static void main(String[] args) {
		Date1 d1 = new Date1();
		d1.getDate();
		Date1 d2 = new Date1();
		d2.getDate();
		if(d1.compareDate(d2)) {
			System.out.println("Dates are same.");
		}else {
			System.out.println("Dates are different.");
		}
		//d1.ShowDate();
	}

}
