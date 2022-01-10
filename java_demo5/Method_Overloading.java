package com.org.gen.D2;

public class Method_Overloading {
int add(int a ,int b) {
	return a+b;
}
int add(int a ,int b ,int c) {
	return a+b+c;
}
float add(float a,float b) {
	return (a+b);
}	
int add( int x){
	return x*x*x;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Method_Overloading m = new Method_Overloading();
int x1 =  m.add(1, 2);
int x2 = m.add(2, 3,4);
float x3 = m.add(2.3f,6.1f);
int x4 = m.add(2);
System.out.println(x1+" " +x2+" "+x3+" "+x4);


	
	
	}

}
