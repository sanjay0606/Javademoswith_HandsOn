package com.org.gen.D4;
//object class tostring() and hasacode()
public class Student_Data {
	
	static int last_roll = 200;
	int roll_no;
	

	public Student_Data() {
		super();
		// TODO Auto-generated constructor stub
		roll_no = last_roll;
		last_roll++;
	}
	

	@Override
	public int hashCode() {
		return roll_no;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_Data other = (Student_Data) obj;
		if (roll_no != other.roll_no)
			return false;
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Data s =new Student_Data();
		
		
		System.out.println(s);
		System.out.println(s.toString());
	}

}
