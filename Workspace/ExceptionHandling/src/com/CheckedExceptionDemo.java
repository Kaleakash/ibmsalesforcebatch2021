package com;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Hi");
		try {
		Thread.sleep(5000);
		}catch (ArithmeticException e) {
			
		}						
		System.out.println("Take Lunch Break......");
	}

}
