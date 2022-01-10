package com.org.gen.D3;
import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int flag;
		System.out.print("Enter the number of test case = ");
		int tc = sc.nextInt();
		int[] k = new int[tc];
		//loop to take input according to the test cases
		for(int i=0;i<tc;i++) {
			System.out.print("Enter the digit = ");
			k[i] = sc.nextInt();
		}
		//loop for test cases
		for(int i=0;i<k.length;i++) {
			int count = 0;
			//loop for every single element btw 2 and case
			for(int p = 2; p<=k[i];p++) {
				flag = 1 ;
				//loop to check if no is divisible by every other no
				for(int q =2;q<=p/2;q++) {
					if(p%q==0) {
						flag =0;
						break;
					}
				}
				if(flag==1) {
					count=count+1;
				}
			}System.out.println("Count of prime no between 2 and "+k[i]+" = "+count);
		}
		
	}
}
