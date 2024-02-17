package com.wajahat.p1;

import java.util.*;

public class MAP {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("wajahat",101);
		hm.put(102,"sandeep");
		hm.put(null,null);
		hm.put("khalil",101);
		hm.put("wajahat",101); //duplicate key not allowed
		hm.put(303,303);
	   System.out.println(hm);//elements will be in unorderd ...w..

	   System.out.println("LinkedHashMap");
	   LinkedHashMap lm = new LinkedHashMap();
	   lm.put("wajahat",101);
		lm.put(102,"sandeep");
		lm.put(null,null);
		lm.put("khalil",101);
		lm.put("wajahat",101); //duplicate key not allowed
		lm.put(303,303);
		System.out.println(lm); //elements will be in added order
		 System.out.println("TreeMap");
	   TreeMap  tm = new TreeMap();
	   tm.put(104,101);//duplicates key not allowed
	   tm.put(104,"wajahat");
		tm.put(345,null); //null key not allowed
		tm.put(134,"sandeep");
		tm.put(5687,101);
		tm.put(303,"udit");
		System.out.println(tm); //elements will come in sorted order

	}

}
