package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ByteWiseKeyboardAndFile {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		System.out.println("Enter the text");
		int ch;
		while( (ch = dis.read()) != '@') {
			System.out.print(ch+" , "+(char)ch);
					fos.write(ch);
		}
		dis.close();
		fos.close();
	}

}
