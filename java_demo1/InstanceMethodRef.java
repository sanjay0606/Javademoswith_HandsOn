package com.org.gen.D5;

import java.util.function.BiFunction;

interface B{
	public void add(int x,int y);
}
class Addition{
	public void sum(int a,int b) {
		System.out.println("Sum = "+(a+b));
	}
}
public class InstanceMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition add1 = new Addition();

//lamda
B b1 = (a,b)->System.out.println("Sum = "+(a+b));
b1.add(11,10);

//method ref
B b2 = add1::sum;
b2.add(100, 1);


	}

}
