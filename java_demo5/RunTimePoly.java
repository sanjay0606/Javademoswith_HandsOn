package com.org.gen.D2;
class Child1{
	
	public Child1() {
		super();
		// TODO Auto-generated constructor stub
	}

	void print() {
		System.out.println("Child1");
	}
}

class Child2 extends Child1{
	void print() {
		System.out.println("Child2");
	}
}
class Child3 extends Child1{
	void print() {
		System.out.println("Child 3");
	}
}
public class RunTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child1 c = new Child2();
c.print();
Child1 b = new Child3();
b.print();
	}

}
