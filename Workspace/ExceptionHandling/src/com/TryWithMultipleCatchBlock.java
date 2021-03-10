package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		int abc[]= {10};
		String num="10a";
		try {
			int res = 10/abc[0];
			int n = Integer.parseInt(num);		//converting string to int;
			System.out.println(n+100);
		} catch (ArithmeticException e) {
			System.out.println("Divided by Zero "+e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index "+e);
		}catch (Exception e) {
			System.out.println("Generic "+e);
		}
		System.out.println("Finished");
	}

}
