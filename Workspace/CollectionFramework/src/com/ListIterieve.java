package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterieve {

	public static void main(String[] args) {
		List ll = new ArrayList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		System.out.println(ll);
		System.out.println("Using For each loop");
		for(Object obj:ll) {
			System.out.println(obj);
		}
		System.out.println("Using ListIterator - forward direction");
		ListIterator li = ll.listIterator(3);
		/*while(li.hasNext()) {
			Object obj = li.next();
			System.out.println(obj);
		}*/
		System.out.println("Using ListIterator - backward direction");
		while(li.hasPrevious()) {
			Object obj = li.previous();
			System.out.println(obj);
		}
	}

}
