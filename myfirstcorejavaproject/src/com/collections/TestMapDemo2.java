package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!");
		
		Map<String, String> m = new HashMap<>();
		m.put("AP", "AndhraPradesh");
		m.put("TG", "Hyderabad");//Old value
		m.put("TG", "Telangana");//New Value
//		In Map it always, old value is replacing with new value when we have a duplicate key.
		
		m.put("KA", "Bangalore");
		m.put("KA", "Karnataka");
		
		m.put("TN", "Madras");
		m.put("TN", "Tamil Nadu");
		
		m.put("KL", "Thiruvananthapuram");
		
		System.out.println(m);
		System.out.println(m.containsKey("TN"));//true
		System.out.println(m.containsValue("Bangalore"));//false because Bangalore is changes to  Karnatakaa
		
//		Set of String
		System.out.println(m.keySet());//[KL, TG, KA, TN, AP]
//		Collections of String
		System.out.println(m.values());//[Thiruvananthapuram, Telangana, Karnataka, Tamil Nadu, AndhraPradesh]
		
		System.out.println(m.get("TN"));//Tamil Nadu
		
		Set<Entry<String, String>> entries = m.entrySet();
		
		for(Entry<String, String> entry :entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("Main Method Ended!");
	}

}
