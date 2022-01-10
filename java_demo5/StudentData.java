package com.org.gen.D2;
class Data{
	int rno;
	String name;
	
	Data(int r,String n){
		rno = r;
		name =n;
	}
}
public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data[] arr = new Data[3];
		arr[0] = new Data(1, "Saroo");
		arr[1] = new Data(2, "Sam");
		arr[2] = new Data(3, "Jhon");
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i].name + arr[i].rno);
		}
		
	}

}
