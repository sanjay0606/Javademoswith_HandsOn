package com.org.gen.day1;

public class Info {
	String name;
	double YOJ;
	double salary;
	String addr;
	
	Info(String n,double d,double s,String r){
		name = n;
		YOJ = d;
		salary = s;
		addr = r;
	}
void display() {
	System.out.println(name+"     "+YOJ+"           "+addr);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name     "+"Year of Joining"+"     Address");
		Info f1 = new Info("Robert", 1994,45000,"64 C-WallsStreet");
		Info f2 = new Info("Sam",2000,4000,"68 D- WallsStreet");
		Info f3 = new Info("John",1999,34000,"26 B-WallsStreet");
		f1.display();
		f2.display();
		f3.display();
		
	}

}
