package com.org.gen.day1;

public class Student_1 {
	String name;
	int rollno ;
	
	Student_1(String n,int r){
		name = n;
		rollno = r;
	}
	
void display() {
	System.out.println("Name -"+name+" Rollno -"+rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_1 s1 = new Student_1("John",2);
		s1.display();
	}

}
