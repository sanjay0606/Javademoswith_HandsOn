package com.org.gen.D4;

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Child thread");	
			}
		});
		t.start();
		System.out.println("Mian Thread");
	}

}
