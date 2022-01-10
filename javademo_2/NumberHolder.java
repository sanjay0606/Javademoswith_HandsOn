package com.org.gen.day1;

public class NumberHolder {
	 int empid;
	 float fee;
	 
	 NumberHolder(int a , float b){
		 this.empid = a;
		 this.fee = b;
	 }
void display() {
	System.out.println("empid = "+empid+" fee = "+fee);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberHolder n1 = new NumberHolder(101, 2.4f);
		NumberHolder n2 = new NumberHolder(102,4.5f);
		n1.display();
		n2.display();
		
		
	}

}

