package com.org.gen.D4;

public class CloneDemo implements Cloneable {
	String name;
	int version;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneDemo obj1 = new CloneDemo();
		
		//init name and version
		obj1.name ="Java";
		obj1.version = 11;
		System.out.println(obj1.name);
		System.out.println(obj1.version);
	
		//changing value of name by obj2
		CloneDemo obj2= (CloneDemo)obj1.clone();
		obj2.name= "Python";
		
		System.out.println(obj2.name);
		System.out.println(obj1.name);
		
	}

}
