package com.org.gen.day1;

public class Demo {
	String name ;
	String comp ;
	int empId ;
	double salary ;
	

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Comp : "+ comp);
		System.out.println("Employee ID : "+ empId);
		System.out.println("Employee Salary : "+ salary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	System.out.println("Employee Name : "+ name);
		System.out.println("Employee Comp : "+ comp);
		System.out.println("Employee ID : "+ empId);
		System.out.println("Employee Salary : "+ salary);*/
		Demo emp1 =new Demo(); 
		emp1.display();
	    Demo emp2 = new Demo( "Sourav", "Genpact", 101, 450000);
	    emp2.display();
	    Demo emp3 = new Demo("Sam", "Adj", 102, 12412);
	    Demo emp4 = new Demo("safi","Adob",103,124214);
	    emp3.display();
	    emp4.display();
	}
	public Demo(String name, String comp, int empId, double salary) {
		super();
		this.name = name;
		this.comp = comp;
		this.empId = empId;
		this.salary = salary;
	}

}
