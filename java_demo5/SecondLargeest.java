package com.org.gen.D2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+ i + "th element into Array = ");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Second largest = "+arr[arr.length-2]);
		
	}

}
