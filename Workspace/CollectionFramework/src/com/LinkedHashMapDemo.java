package com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap hm = new LinkedHashMap();
		hm.put(2, "Ravi");
		hm.put(1,"Ajay");
		hm.put(3, "Dinesh");
		hm.put(4, "Balaji");
		System.out.println(hm);
		hm.put(1, "Mahesh");
		hm.put(2, "Balaji");
		System.out.println(hm);
		if(hm.containsKey(6)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		System.out.println("Get value "+hm.get(3));
		hm.remove(4);
		System.out.println(hm);
	}
	
}
