package com.org.gen.D3;
@FunctionalInterface	
interface Interface{
	public void add(int a,int b);
	default void show() {
		System.out.println("Defaukt method");
	}
	default int calluation(int a,int b, int c) {
		return a*b*c;
	}
	
}
interface myInterface{
	void mainmethod();
	default void show() {
		System.out.println("thos myinterface default method");
	}
}



public class TestInterface implements Interface, myInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestInterface t = new TestInterface();
t.add(4, 5);
t.show();
int c = t.calluation(2,3,4);
System.out.println(c);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition ="+(a+b));
	}

@Override
public void mainmethod() {
	// TODO Auto-generated method stub
	System.out.println("this method is main interface 2");
}

@Override
public void show() {
	// TODO Auto-generated method stub
	myInterface.super.show();
}
}
