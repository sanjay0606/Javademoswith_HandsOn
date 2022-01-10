package com.org.gen.D2;
import java.util.Scanner;
public class Avg_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[5];
int sum = 0,avg;
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements into Array");
for(int i=0;i<arr.length;i++) {
	System.out.print("Enter "+ i + "th element into Array = ");
	arr[i]=sc.nextInt();
	sum +=arr[i];
}
avg = sum /arr.length;
System.out.println("Average of Array = "+avg);
	}

}
