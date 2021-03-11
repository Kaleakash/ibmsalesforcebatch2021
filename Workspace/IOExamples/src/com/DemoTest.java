package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoTest {

	public static void main(String[] args) throws Exception{
	Employee emp = new Employee();
	emp.setId(100);
	emp.setName("Ravi");
	emp.setSalary(14000);
	
	//System.out.println("id is "+emp.getId());
	//System.out.println("name is "+emp.getName());
	//System.out.println("salary is "+emp.getSalary());
	emp.setSalary(16000);
	
	FileOutputStream fos = new FileOutputStream("emp1.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(emp);
	System.out.println("Object serialization done successfully...");
	/*	
	FileInputStream fis = new FileInputStream("emp1.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj = ois.readObject();
	Employee emp1 = (Employee)obj;	//down level type casting. 
	System.out.println("id is "+emp1.getId());
	System.out.println("name is "+emp1.getName());
	System.out.println("salary s "+emp1.getSalary());
	System.out.println("Object De-Serialization done successfully...");*/
	}

}
