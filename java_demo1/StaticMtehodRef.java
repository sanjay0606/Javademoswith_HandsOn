package com.org.gen.D5;
interface A{
	public boolean checkdigit(int x);
}
class Digit{
	public static boolean isDigit(int x){
		return x>10 && x<10;
	}
}
public class StaticMtehodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lamda
		A a1 = (x) ->{return x>10 && x<10;};
		System.out.println(a1.checkdigit(90));
		
//method ref
		A a2 = Digit::isDigit;
		System.out.println(a2.checkdigit(9));
		
		
	}

}
