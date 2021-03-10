package com;

public class TwoTryCatchBlock {
	public static void main(String[] args) {
		int a=10;
		int b=1;
		try {
			int res1 =a/b;
			System.out.println("Result is "+res1);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		int abc[]= {10,20,30};
		try {
			int res2 = 10/abc[0];	
			System.out.println("Result "+res2);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Finish");
	}

}
