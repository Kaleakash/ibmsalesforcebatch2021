package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StorePrimitiveInformation {

	public static void main(String[] args) throws Exception{
		/*int id = 100;
		String name = "Ajay";
		float salary = 12000;
		boolean res = true;

		FileOutputStream fos = new FileOutputStream("emp.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeFloat(salary);
		dos.writeBoolean(res);
		dos.close();
		fos.close();
		System.out.println("Employee primtive details in file");*/
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		int id1 = dis.readInt();
		String name1 = dis.readUTF();
		float salary1 = dis.readFloat();
		boolean res1 =  dis.readBoolean();
		System.out.println("id is "+id1);
		System.out.println("name is "+name1);
		System.out.println("salary is "+salary1);
		System.out.println("result is "+res1);
	}

}
