package com.org.gen.D2;

import java.util.Scanner;

public class Initial_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+ i + "th element into Array = ");
			arr[i]=sc.nextLine();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] = "+ arr[i]);
		}
	}

}
