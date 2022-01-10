package com.org.gen.D2;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =0;
		for(int i =1;i<=3;i++) {
			for(int j =1;j<=3-i;j++) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				System.out.print("* ");
				++k;
			}System.out.println();
		}

	}
}
