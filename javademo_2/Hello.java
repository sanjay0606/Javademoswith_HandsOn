package com.org.gen.day1;

public class Hello {
	int rollno;
	String name;
	static String college="ITC";
	 static void change() {
	    	college = "Bttm";
	    }
	Hello(int r,String n){
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno+ " "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h1 = new Hello(101, "Saroo");
		Hello.change();
		Hello h2 = new Hello(102, "Sazxcroo");
		h1.display();
		h2.display();
		
	}

}
