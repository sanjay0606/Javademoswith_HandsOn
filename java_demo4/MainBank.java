package com.org.gen.D3;
abstract class RBIBank{
	 abstract int intgetInterestRate();
}

class SBI extends RBIBank{

	@Override
	int intgetInterestRate() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}
class BOB extends RBIBank{

	@Override
	int intgetInterestRate() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
class ICICI extends RBIBank{

	@Override
	int intgetInterestRate() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}
public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOB b = new BOB();
		int x = b.intgetInterestRate();
		System.out.println(x);
	}

}
