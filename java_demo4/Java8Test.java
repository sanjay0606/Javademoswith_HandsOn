package com.org.gen.D3;
//java 8 having SAM interface(single abstract method),means only one abstract method is allowed
@FunctionalInterface
interface square{
	
	int cal(int x); //abstract method
}

public class Java8Test implements square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 7;
Java8Test jt = new Java8Test();
int x = jt.cal(a);
System.out.println(x);
	}

	@Override
	public int cal(int x) {
		// TODO Auto-generated method stub 
		return x*x;
	}

}
