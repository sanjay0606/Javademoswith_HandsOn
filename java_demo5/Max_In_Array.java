package com.org.gen.D2;

import java.util.Scanner;

public class Max_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter "+ i + "th element into Array = ");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print("Max element in Array = "+ max);
	}

}
