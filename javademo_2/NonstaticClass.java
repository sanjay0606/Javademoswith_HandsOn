package com.org.gen.day1;


class Car{
	String carType;
	String carName;
	public Car(String cartype, String carname) {
		super();
		this.carType = carType;
		this.carName = carName;
	}
	private String getCarName() {
		return this.carName;
	}
	class Engine{
		String enginetype;
		void setEngine() {
			if(Car.this.carType.equals("abcd")) {
				if(Car.this.getCarName().equals("Crysler")) {
					this.enginetype = "smaller";
				}else {
					this.enginetype="bigger";
				}}else {
					this.enginetype = "toobig";
			}
		}String getEngineType(){
			return this.enginetype;
		}
	}
}
public class NonstaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c = new Car("mazda", "4wd");
//create obj of innerclass using outerclass
Car.Engine eng = c.new Engine();
eng.setEngine();
System.out.println("Engine type for 4wd "+eng.getEngineType());

Car c2 = new Car("Crysler", "Bwd");
Car.Engine eng1 = c2.new Engine();
System.out.println("Engine type for 4wd "+eng1.getEngineType());

	}

}
