package com.org.gen.D2;

public class Banker {
float Interest(int a){
	return a*0.2f;
}
float Interest(int a ,int b) {
	return (a+b)*0.2f;
}
float Interest(int a ,int b,int c) {
	return (a+b+c)*0.2f;
}
float Interest(int a ,int b,int c, int d) {
	return (a+b+c+d)*0.2f;
}
float Interest(int a ,int b,int c, int d, int f) {
	return (a+b+c+d+f)*0.2f;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Banker b1 = new Banker();
double x1 = b1.Interest(1000);
double x2 = b1.Interest(1000,1500);
double x3 = b1.Interest(1000,1500,2000);
double x4 = b1.Interest(1000,1500,2000,2500);
double x5 = b1.Interest(1000,1500,2000,2500,3000);

	System.out.println("Interest = "+x1);
	System.out.println("Interest = "+x2);
	System.out.println("Interest = "+x3);
	System.out.println("Interest = "+x4);
	System.out.println("Interest = "+x5);

	}

}
