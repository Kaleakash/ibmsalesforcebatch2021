package com;

import java.util.Scanner;
public class RuntimeArrayValues {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("how many records do you wan to store ?");
	int n = sc.nextInt();
	int []id=new int[n];
	String name[]=new String[n];
	float salary[]=new float[n];	
	for(int i=0;i<n;i++) {
		System.out.println("Enter employee details "+(i+1));
		id[i]=sc.nextInt();
		name[i]=sc.next();
		salary[i]=sc.nextFloat();
	}
	System.out.println("All employee details are ");
	for(int i=0;i<n;i++) {
		System.out.println("id is "+id[i]+" Name is "+name[i]+" Salary is "+salary[i]);
	}
	}

}
