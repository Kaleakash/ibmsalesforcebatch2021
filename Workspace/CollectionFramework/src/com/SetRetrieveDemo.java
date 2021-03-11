package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetrieveDemo {

	public static void main(String[] args) {
		Set ss  = new HashSet();
		ss.add(10);		// auto-boxing : converted int to Object. 
		ss.add(20);
		ss.add(30);
		ss.add(40);
		System.out.println(ss);
		System.out.println("Using for each loop");
		for(Object a:ss) {
			System.out.println(a);
		}
		System.out.println("Using iterator");
		//Iterator inteface which provide set of method which help to retreive 
		Iterator ii = ss.iterator();		// method part of Collection and return type is Iterator interface reference. 
		while(ii.hasNext()) {
			Object obj = ii.next();		
			System.out.println(obj);
		}
	}

}
