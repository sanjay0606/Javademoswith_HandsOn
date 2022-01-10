package com.org.gen.D3;
class Cars{
	int speed; String brand ; String engin;

	public Cars(int speed, String brand, String engin) {
		super();
		this.speed = speed;
		this.brand = brand;
		this.engin = engin;
	}
	void readDoc(){
		System.out.println("All car must have Docs");
	}
}
class BMW extends Cars{
	int seats; String rooftop;

	public BMW(int speed, String brand, String engin, int seats, String rooftop) {
		super(speed, brand, engin);
		this.seats = seats;
		this.rooftop = rooftop;
	}
	void readDoc(){
		System.out.println("BMW  car has all Docs");
	}
	void ShowFeatures(){
		System.out.println("Carspeed="+speed+"brand= "+brand+"seats="+seats+"roof="+rooftop);
	}
}
class Audi extends Cars{
	int noofdoors;

	public Audi(int speed, String brand, String engin, int noofdoors) {
		super(speed, brand, engin);
		this.noofdoors = noofdoors;
	}
	void readDoc(){
		System.out.println("Audi Documents are ready");
	}
	void ShowFeatures(){
		System.out.println("Carspeed="+speed+"brand= "+brand+"noofdoors="+noofdoors);
	}
	
}
public class Inhertanceexp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Audi a = new Audi(200, "R-8", "Vtype", 4);
a.readDoc();
a.ShowFeatures();

	}

}
