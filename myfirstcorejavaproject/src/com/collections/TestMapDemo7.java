package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo7 {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!");
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Abhi");
		m.put(2, "Rahul");
		m.put(3, "Anjan");
		m.put(4, "Pranay");
		m.put(5, "Yash");
//		m.put(null, null);
//		m.put(null, "Hello");
//		m.put(6, null);
//		m.put(7, null);
		
		System.out.println(m);
		System.out.println("Main Method Ended!!");

	}

}
