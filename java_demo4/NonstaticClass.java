package com.org.gen.D3;


class Car3{
	String carType;
	String carName;
	public Car3(String cartype, String carname) {
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
			if(Car3.this.carType.equals("abcd")) {
				if(Car3.this.getCarName().equals("Crysler")) {
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
Car3 c = new Car3("mazda", "4wd");
//create obj of innerclass using outerclass
Car3.Engine eng = c.new Engine();
eng.setEngine();
System.out.println("Engine type for 4wd "+eng.getEngineType());

Car3 c2 = new Car3("Crysler", "Bwd");
Car3.Engine eng1 = c2.new Engine();
System.out.println("Engine type for 4wd "+eng1.getEngineType());

	}

}
