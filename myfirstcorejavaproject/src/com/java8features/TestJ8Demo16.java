package com.java8features;

import java.util.function.Predicate;

public class TestJ8Demo16 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		String[] names = {"Axar Patel", "Washignton", "Shubman Gill", "Shreyash", "Virat"};
		
		Predicate<String> p1 = (s) -> s.length() > 5;
		Predicate<String> p2 = (s) -> s.contains("h");
		Predicate<String> p3 = p1.and(p2).negate();
//		Predicate<String> p4 = p1.or(p2).negate();//Virat

		
		for (String name : names) {
			if(p3.test(name)) {
				System.out.println(name);
			}
		}
		System.out.println("Main Method Ended");
	}

}