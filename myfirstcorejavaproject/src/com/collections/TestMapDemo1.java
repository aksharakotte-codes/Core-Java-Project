package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!");
		
		Map<Integer, String> m = new HashMap<>();
		m.put(7, "Dhoni");
		m.put(18, "Virat");
		m.put(45, "Rohit");
		m.put(33, "Pandya");
		m.put(34, "Pandya");
		m.put(1, "Rahul");
		m.put(9, "Srikanth");
		m.put(2, null);
		m.put(3, null);
		
//		The previous value associated with key, or null if there was no mapping for key.
		System.out.println(m.put(77, "Gill"));//null
		System.out.println(m.put(9, "Ashrith"));//Srikanth
		
//		In Map it always, old value is replacing with new value when we have a duplicate key.
		System.out.println(m);// Overrides Srkanth and adds Ashrith in list
		System.out.println("Main Method Ended!");
	}

}
