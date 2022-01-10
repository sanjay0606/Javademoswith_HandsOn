package com.org.gen.D2;

public class Maiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10,n2=5,n3=20,largeNumber;
		if ((n1>n2)&&(n1>n3)) {
			largeNumber = n1;
		}else if(n2>n3) {
			largeNumber= n2;
		}else {
			largeNumber=n3;
		}
		
		System.out.println(largeNumber);
	}

}
