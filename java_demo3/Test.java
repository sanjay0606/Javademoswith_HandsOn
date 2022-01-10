package com.org.gen.D4;
class clonetest implements Cloneable{
	int i;
	String s;
	public clonetest(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		clonetest cc1 = new clonetest(11,"java");
		
		//downcasting
		
		clonetest cc2= (clonetest)cc1.clone();
		
		System.out.println(cc2.i);
		System.out.println(cc2.s);
		
	}

}
