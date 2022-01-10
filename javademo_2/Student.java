package com.org.gen.day1;

public class Student {
	int rollno;
	String name;
	Float fee;
	
	Student(int rollno,String name,Float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
public class Test{
		Test(){
			System.out.println("testclass");
		}
		Test(int x){
			System.out.println("testclass" +x);
		}}
	void dispaly() {
		System.out.println(name+" "+fee+" "+rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student(101, "San", 224.4f);
Student s2 = new Student(102, "Sanjay", 222224.4f);

s1.dispaly();
s2.dispaly();
Test t = new Test(100);

	}

}
