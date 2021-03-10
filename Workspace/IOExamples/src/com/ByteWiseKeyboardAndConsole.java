package com;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ByteWiseKeyboardAndConsole {

	public static void main(String[] args) throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		PrintStream ps = System.out;
		ps.println("Enter the id");
		int id = Integer.parseInt(dis.readLine());	
		ps.print("Enter the name");
		String name = dis.readLine();
		ps.println("Enter the salary");
		float salary = Float.parseFloat(dis.readLine());
		ps.println("id is "+id);
		ps.println("Name is "+name);
		ps.println("Salary is "+salary);
	}

}
