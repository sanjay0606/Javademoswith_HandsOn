package com.org.gen.day1;

public class Quest2 {
	long rollno;
	long phno;
	String addr;
	String name;
	
	Quest2(long r, long p,String a, String n){
		rollno = r;
		phno = p;
		addr = a;
		name = n;
	}
	
void display() {
	System.out.println("Address = "+addr+" Rollno = "+rollno+" PhoneNO = "+phno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quest2 s1 = new Quest2(585, 9482629629L ,"hno 20 ", "Sam");
		Quest2 s2 = new Quest2(555, 986332335L ,"hno 25 ", "John");
		s1.display();
		s2.display();

	}

}  
