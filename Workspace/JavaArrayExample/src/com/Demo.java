package com;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[];
		int xyz[]= {10,20,30,40,50};
		System.out.println(xyz[0]);
		System.out.println(xyz[2]);
		System.out.println("Using for loop");
		for(int i=2;i<xyz.length;i=i+2) {
			System.out.println(xyz[i]);
		}
		System.out.println("using for each loop or enhanced loop");
		for(int a : xyz) {
				System.out.println(a);
		}
	}

}
