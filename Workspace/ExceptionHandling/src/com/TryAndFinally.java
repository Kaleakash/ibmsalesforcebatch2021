package com;

public class TryAndFinally {

	public static void main(String[] args) {
		try {
			int res = 10/0;
			System.out.println("No Exception");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Normal Statement");
	}
}
