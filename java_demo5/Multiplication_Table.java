package com.org.gen.D2;
import java.util.Scanner;
public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		for(int i = 0 ; i <=10;i++) {
			System.out.println(n+"X"+i+"="+(n*i));
			
		}
		
	}

}
