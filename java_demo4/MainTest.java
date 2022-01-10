package com.org.gen.D3;

abstract class Car1{
	int size,speed;
	
	public Car1(int size, int speed) {
		super();
		this.size = size;
		this.speed = speed;
	}
	abstract void accelerate();
	abstract void ModelDetails();
	abstract void engineCare();
	void Costing() {
		System.out.println("Car Cost");
	}
	static void wheels() {
		System.out.println("No of wheels");
	}
}
class Suzuki extends Car1{

	public Suzuki(int size, int speed) {
		super(size, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Suzuik Accekerates");
	}

	@Override
	void ModelDetails() {
		// TODO Auto-generated method stub
		System.out.println("Suzuil model");
	}

	@Override
	void engineCare() {
		// TODO Auto-generated method stub
		System.out.println("Suzike engineCare");
	}
	
}
class Honda extends Car1{

	public Honda(int size, int speed) {
		super(size, speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Honda Accelerate");
	}

	@Override
	void ModelDetails() {
		// TODO Auto-generated method stub
		System.out.println("Honda Model");
	}

	@Override
	void engineCare() {
		// TODO Auto-generated method stub
		System.out.println("Honda engincare");
	}
	
}

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car1 cc = new Suzuki(125, 256);
cc.engineCare();
cc.accelerate();
Car1 cc1 = new Honda(324, 333);
cc1.accelerate();
cc1.engineCare();
	}

}
