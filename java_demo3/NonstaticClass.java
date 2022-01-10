package com.org.gen.D4;

class Car{
	String carType;
	String carName;
	public Car(String carType, String carName) {
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
			if(Car.this.carType.equals("4wd")) {
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
Car c = new Car("mazda", "8wd");
//create obj of innerclass using outerclass
Car.Engine eng = c.new Engine();
eng.setEngine();
System.out.println("Engine type for 4wd "+eng.getEngineType());

Car c2 = new Car("Crysler", "4wd");
Car.Engine eng1 = c2.new Engine();
eng1.setEngine();
System.out.println("Engine type for 8wd "+eng1.getEngineType());

	}

}
