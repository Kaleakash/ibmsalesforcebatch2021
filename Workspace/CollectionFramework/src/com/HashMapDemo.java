package com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(2, "Ravi");
		hm.put(1,"Ajay");
		hm.put(3, "Dinesh");
		hm.put(4, "Balaji");
		System.out.println(hm);
		hm.put(1, "Mahesh");
		hm.put(2, "Balaji");
		hm.put("Abc", "Xyz");
		System.out.println(hm);
		
		if(hm.containsKey(6)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
