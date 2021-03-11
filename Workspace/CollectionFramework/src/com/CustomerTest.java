package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		List<Customer> listOfCustomer = new ArrayList<>();
		Customer c1 = new Customer();
		c1.setCustId(100);
		c1.setCustName("Ajay");
		c1.setAge(21);
		Customer c2 = new Customer(101, "Ramesh", 22);
		Customer c3 = new Customer(102, "Vijay", 23);
		System.out.println("Number of customer records are "+listOfCustomer.size());
		listOfCustomer.add(c1);
		listOfCustomer.add(c2);
		listOfCustomer.add(c3);
		System.out.println("Number of customer records are "+listOfCustomer.size());
		//listOfCustomer.remove(1);
		System.out.println("Number of customer records are "+listOfCustomer.size());
		Iterator<Customer> ii = listOfCustomer.iterator();
		while(ii.hasNext()) {
			Customer cc = ii.next();
			System.out.println(cc);
			//System.out.println("Cust id is "+cc.getCustId()+" Name is "+cc.getCustName()+" Age is "+cc.getAge());
		}
	}

}
