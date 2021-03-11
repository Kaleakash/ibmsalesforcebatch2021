package com;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		System.out.println("Size of array is "+al.size());
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		System.out.println("Size of array is "+al.size());
		System.out.println(al);
		System.out.println("Retrieve elements using index position "+al.get(1));
		al.add(1, 20);		//position and elements. 
		System.out.println(al);
		System.out.println("Retrieve elements using index position "+al.get(1));
		System.out.println("Retrieve elements using index position "+al.get(2));
		al.remove(3);			//using index position 
		al.remove(new Integer(400));		// using value delete 
		System.out.println(al);
		System.out.println(al.contains(100));
	}

}
