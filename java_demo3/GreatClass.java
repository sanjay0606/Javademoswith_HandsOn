package com.org.gen.D4;
interface Age{
	int x =21;
	void getAge();
}
class MyClass implements Age{

	@Override
	public void getAge() {
		// TODO Auto-generated method stub
		System.out.println("Age="+x);
	}
	
}
public class GreatClass {
	public static void main(String[] args) {
		
		MyClass ob = new MyClass();
		ob.getAge();
	}
}
