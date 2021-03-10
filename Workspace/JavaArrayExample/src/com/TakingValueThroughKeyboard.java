package com;
import java.util.Scanner;

public class TakingValueThroughKeyboard {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = obj.nextInt();				// scan int value. 
		System.out.println("Enter the name");
		String name= obj.next();			// scan string value 
		System.out.println("Enter the salary");
		float salary = obj.nextFloat();		// scan float value. 
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}

}
