package com.org.gen.D3;
class FourWheel{
	String type;
	
}
class Car extends FourWheel{
	int number_plate;
	int chase_no;
	int model_no;
	void d() {
		System.out.print("hello");
	}
}
class Sedan extends Car{
	int length = 156;
}
class Sportscar extends Car{
	int length = 256;
}
public class InheritanceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sedan f1 = new Sedan();
f1.number_plate = 123;
f1.chase_no = 456;
f1.model_no = 789;
f1.type = "Sedan-123";
System.out.println("Details = type = "+f1.type+" ,NoPlate = "+f1.number_plate+" ,ChaseNo = "
		+f1.chase_no+" ,ModelNo = "+f1.model_no +f1.length);

Sportscar f2 = new Sportscar();
f2.number_plate = 987;
f2.type = "Sportscar";
f2.model_no = 654;
f2.chase_no = 321;
System.out.println("Details = type = "+f2.type+" ,NoPlate = "+f2.number_plate+" ,ChaseNo = "
		+f2.chase_no+" ,ModelNo = "+f2.model_no +f2.length);
	}

}
