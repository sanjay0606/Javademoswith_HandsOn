package com.org.gen.day1;

public class HelloWorld {
	    int id;
	    String name;
	    int age;
	   
	    HelloWorld(int i,String n){
	        id = i;
	        name = n;
	        }
	    
	    HelloWorld(int i,String n , int a){
	        id = i;
	        name = n;
	        age = a;
	        }
void display() {
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HelloWorld h = new HelloWorld(123, "dxbx");
HelloWorld hh = new HelloWorld(122, "asfa", 22);
h.display();
hh.display();
	}

}
