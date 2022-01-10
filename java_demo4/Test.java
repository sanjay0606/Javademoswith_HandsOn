package com.org.gen.D3;
class Teacher extends Person{
//name age and gender must be common get inherited from person 
	static int count =20;
	String subject;
	int exp;
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.name = "Seema";
		System.out.println(t.name);
		System.out.println(t.count);
	}

}
