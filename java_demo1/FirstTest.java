package com.org.gen.D5;
interface ArrayProcessor{
	double apply(double[] array);
}

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = {2.8,3.6,4.7,5.5,6.0};
		
		//max element in array
		ArrayProcessor a1 = (max)->{for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
		double temp =arr[i];arr[i]=arr[j];arr[j]=temp;
		}
		}
		}System.out.println("Max = "+arr[arr.length-1]);
		return 0;
			};
			
		a1.apply(arr);
		
		//min element in array
		ArrayProcessor a2 = (min)->{ double m = arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]< m) {
					m=arr[i];
				}
			}System.out.println("Min = "+m);
			return 0;
		};
		a2.apply(arr);
		
		//sum of all element in array
		ArrayProcessor a3 = (total)->{
			double sum = 0;
			for(int i =0;i<arr.length;i++) {
				sum+=arr[i];
			}System.out.println("Sum = "+sum);
			return sum;
			
		};
		a3.apply(arr);
		
		//average of all element in array
		ArrayProcessor a4 = (avrg)->{
			double sum = 0;
			for(int i =0;i<arr.length;i++) {
				sum+=arr[i];
			}
			double avg = sum/arr.length;
			System.out.println("Avg = "+avg);
			return sum;
			
		};
		a4.apply(arr);
		}
	}



