package com.org.gen.D2;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double year = 1999;
		if (year%4==0) {
			if(year%100==0) {
				if (year%400==0) {
					System.out.println("Leap year");
				}else {
					System.out.println("Not a Leap Year");
				}
			}else {System.out.println("Leap year");
		}
	}else {
		System.out.println("Not a Leap Year");
	}
	}
}
