package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseFileInputAndOutput {

	public static void main(String[] args)  throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\91990\\Desktop\\StringReverse.java");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("info.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read()) != -1) {
			bos.write(ch);
			System.out.print((char)ch);
		}
		
		
		bos.flush();
		fis.close();
		fos.close();
		System.out.println("File copied....");
	}

}
