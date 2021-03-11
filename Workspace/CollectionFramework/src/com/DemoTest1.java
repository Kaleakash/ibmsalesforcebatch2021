package com;

public class DemoTest1 {
public static void main(String[] args) {
	Customer cust[]=new Customer[100];
	cust[0]=new Customer();
	cust[0].setCustId(100);
	cust[0].setCustName("Ramesh");
	cust[0].setAge(21);
	
	System.out.println("Id is "+cust[0].getCustId());
	System.out.println("Name is "+cust[0].getCustName());
	System.out.println("Salary is "+cust[0].getAge());
}
}
