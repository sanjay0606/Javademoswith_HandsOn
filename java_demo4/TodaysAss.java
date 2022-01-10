package com.org.gen.D3;
import java.util.Scanner;
interface Prime{
	int Total(int[] k);
	default int data(int[] a) {
		return 0;
	}
}
public class TodaysAss implements Prime {
	public static void main(String[] args) {
		TodaysAss c1 = new TodaysAss();
		int count =0;
	int[] k =new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no of test cases = ");
	int a = sc.nextInt();
	for(int i =0; i<a;i++) {
		System.out.print("Enter the digit =");
		k[i] = sc.nextInt();
		c1.Total(k);
	}
	c1.Total(k);

	}
	

	@Override
	public int Total(int[] k) {
		int count = 0;
		for(int i = 0; i<k.length;i++) {
			for(int j=2; j<= k[i];j++) {
				if(k[i]%j!=0) {
					count =count+1;

				}
			}
			System.out.print(count);
		}
		return count;
	}
}
