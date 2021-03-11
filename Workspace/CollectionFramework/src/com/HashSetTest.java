package com;

import java.util.HashSet;
class Emp {
	
}
class Dept {
	
}
public class HashSetTest {

	public static void main(String[] args) {
	HashSet hs = new HashSet();
	/*int a=10;
	//Integer b = new Integer(a);		// converting primitive to objects. 
	Integer b =a;			//auto-boxing : converting primitive to integer object. 
	
	hs.add(a);
	hs.add(100);		//auto-boxing : converting primitive to objects. 
	hs.add(10.10);*/
	hs.add(10);
	hs.add(10.10);
	hs.add("Ravi");
	hs.add(true);
	Emp e1 = new Emp();
	hs.add(e1);
	Dept d1 = new Dept();
	hs.add(d1);
	System.out.println(hs);
	}

}
