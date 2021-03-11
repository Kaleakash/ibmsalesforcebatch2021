package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		System.out.println("Size "+ss.size());
	
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println("Top elements retrieve "+ss.pop());
		System.out.println(ss);
		System.out.println("To check top most elements "+ss.peek());
		System.out.println(ss);
		System.out.println(ss.search(100));
		System.out.println(ss.search(3000));
	}

}
