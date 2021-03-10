package com;

public class TryAndCatchBlock {
	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		int abc[]= {};
		int xyz[]= {10,20,30,40,50};
		try {
		int res = a/b;
		System.out.println("Result is "+res);
		int res1 = 100/xyz[7];
		System.out.println("Result is "+res1);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());		//short message 
			System.out.println(e.toString());			// exception name and messasge 
			//e.printStackTrace();								// line number, name and message 
		}
		System.out.println("bye...");
		System.out.println("bye...");
		System.out.println("bye...");
	}
}

