package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection Framework without Generics ie different type of values. 
		/*List ll = new ArrayList();
		ll.add(100);
		ll.add(100.10);
		ll.add("Ravi");
		ll.add(200);
		
		Object obj	 = ll.get(2);		// retrieve in Object
		if(obj instanceof Integer) {
		Integer in = (Integer)obj;	// type casting ie down level type casting 
		int a = in.intValue();			//converting Integer object to primitive 
		System.out.println(a);
		} else if(obj instanceof Double) {
			Double di = (Double)obj;
			double d = di.doubleValue();
			System.out.println(d);
		}else if (obj instanceof String) {
			String ss = (String)obj;
			System.out.println(ss);
		}
	*/
		//Collection framework with Genrics 
		//CollectionClass<Type> ll = new CollectionClass<Type>();
		//Type all wrapper class, Integer, Float, String, UserClassName
		
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(100);				// auto - boxing ... converting primitive to object. 
		ll.add(200);
		ll.add(300);
		ll.add(400);
		
		int n	 = ll.get(0);		// auto-unboxing : converting object to primitive 
		System.out.println(n);
	}

}






