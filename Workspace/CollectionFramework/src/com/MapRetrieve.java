package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrieve {
	public static void main(String[] args) {
		Map mm = new HashMap();
		mm.put(1, "Ravi");
		mm.put(2, "Ramesh");
		mm.put(3, "Rajesh");
		mm.put(4, "Lokesh");
	    Set ss = mm.entrySet();		// convert map to set 
	    Iterator ii = ss.iterator();
	    while(ii.hasNext()) {
	    	//Object obj = ii.next();
	    	//System.out.println(obj);
	    	Map.Entry me = (Map.Entry)ii.next();	// converting set to Map.Entry
	    	System.out.println("Key "+me.getKey() +"  Value "+me.getValue());
	    }
	}
}
