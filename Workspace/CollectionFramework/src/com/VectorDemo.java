package com;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	Vector vv = new Vector();
	vv.add(100);					// return type boolean 
	vv.addElement(101);		// return type void 
	vv.add(102);
	vv.add(103);
	System.out.println(vv);
	System.out.println(vv.contains(100));
	System.out.println(vv.contains(200));
	System.out.println("Get element using index position "+vv.elementAt(1));
	
	}

}
