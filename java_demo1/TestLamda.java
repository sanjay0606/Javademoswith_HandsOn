package com.org.gen.D5;

@FunctionalInterface
interface GenericInter<T>{
	//generic method
	T func(T t); //String func(String t)
}
public class TestLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GenericInter<String> rev = (str)->{
	String result =" ";
	for(int i =str.length()-1;i>=0;i--) 
		result+=str.charAt(i);
	return result;
	
};
System.out.println("Reverse = "+rev.func("Lamda"));

GenericInter<Integer> fact = (n)->{
	int res=1;
	for(int i=1;i<=n;i++)
		res = i*res;
	return res;
};
System.out.println("Factorial = "+fact.func(5));


GenericInter<Double> dbl=(n)->{
	double res=1.0;
	for(double i =1;i<=n;i++)
		res = i*res;
	return res;
};
System.out.println(dbl.func(5.005));
}
}

