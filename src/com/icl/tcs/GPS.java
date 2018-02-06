package com.icl.tcs;

import java.util.Scanner;

public class GPS {

	
	double Latitude ;
	double Longitude ;
	
	
	GPS(){
		Latitude = 0;
		Longitude = 0;
	}
	
	public void getCoordinates () {
		System.out.println("Enter Latitude and Longitude :");
		Scanner sc = new Scanner(System.in) ;
		Latitude = sc.nextDouble();
		Longitude = sc.nextDouble();
		showCoordinates();
		
	}
	public void showCoordinates () {
		System.out.println("Coordinate is : "+ this.Latitude + " "+ this.Longitude);
	}
	public void FindDistance(GPS gc2, GPS gc3){
		double d1 = distance(this.Latitude,this.Longitude,gc2.Latitude,gc2.Longitude,"M");
		double d2 = distance(this.Latitude,this.Longitude,gc3.Latitude,gc3.Longitude,"M");
		
		System.out.println("First and Second persons distance is :"+d1);
		System.out.println("First and Third persons distance is :"+d2);
		
		if(d1>d2) {
			System.out.println("First and Third persons are near , second person is far away");
		}else {
			System.out.println("First and Second persons are near , Third person is far away");
		}
	}
	

private double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
  double theta = lon1 - lon2;
  double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
  dist = Math.acos(dist);
  dist = rad2deg(dist);
  dist = dist * 60 * 1.1515;
  if (unit == "K") {
    dist = dist * 1.609344;
  } else if (unit == "N") {
  dist = dist * 0.8684;
    }
  return (dist);
}
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
/*::  This function converts decimal degrees to radians             :*/
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
private double deg2rad(double deg) {
  return (deg * Math.PI / 180.0);
}
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
/*::  This function converts radians to decimal degrees             :*/
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
private double rad2deg(double rad) {
  return (rad * 180.0 / Math.PI);
}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the coordinate 1 c1");
		GPS c1 = new GPS();
		c1.getCoordinates();
		
		System.out.println("Enter the coordinate 2 c2");
		GPS c2 = new GPS();
		c2.getCoordinates();
		
		System.out.println("Enter the coordinate 3 c3");
		GPS c3 = new GPS();
		c3.getCoordinates();
		
		c1.FindDistance(c2, c3);
		
	}

}
