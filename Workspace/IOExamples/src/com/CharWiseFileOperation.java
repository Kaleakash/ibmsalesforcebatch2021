package com;

import java.io.FileReader;
import java.io.FileWriter;

public class CharWiseFileOperation {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("info.txt");
		int ch;
		while((ch=fr.read()) != -1) {
			fw.write(Character.toUpperCase(ch));
		}
		fr.close();
		fw.close();
		System.out.println("File copied");
	}

}
