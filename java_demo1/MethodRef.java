package com.org.gen.D5;
interface Method1{
	void display();
}

class Multi{
	public static int m1(int x,int y) {
		return x+y*x;
	}
}
public class MethodRef {
	private static void PrivateMethod(){
		System.out.println("this is private statctc method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//referring static mtd
		Method1 m1 = MethodRef::PrivateMethod;
		//calling interface mtd
		m1.display();
	
		
		//lamda
		Method1 mm= ()->{System.out.println(" ");};
	
		//method ref
		
		Method1 m2 = Multi::m1(2,5);
		System.out.println(m2.display)
	
	
	
	
	
	}

}
