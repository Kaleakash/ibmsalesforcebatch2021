package com;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(10);
		hs.add(50);
		hs.add(20);
		hs.add(40);
		hs.add(30);
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		System.out.println(hs);
		System.out.println("Search "+hs.contains(10));
		System.out.println("Search "+hs.contains(100));
		hs.remove(50);
		System.out.println(hs);
		hs.clear();
		System.out.println("Size is "+hs.size());
	}

}
