package com.org.gen.D3;
//Generalization as restriction
abstract class User{
	String name;
	int age;
	String occupation;
	
	abstract void fillform(String name, String occupation);
	
}
class Doctor extends User{
	String specialization;
	int exp;
	@Override
	void fillform(String name, String occupation) {
		// TODO Auto-generated method stub
		
	}
}
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doctor u = new Doctor();
u.exp =20;
	}

}
