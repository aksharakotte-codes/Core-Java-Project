package com.java8features;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestJ8Demo22 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Predicate<Integer> p1 = (i) -> i % 2 == 0;
		System.out.println(p1.test(9));//false
		
		BiPredicate<Integer, Integer> p2 = (i1, i2) -> (i1 * i2) % 2 == 0;
		System.out.println(p2.test(9, 8));//true
		
		BiPredicate<String, String> p3 = (s1, s2) -> s1.length() + s2.length() <= 15;
		System.out.println(p3.test("Srikanth", "C"));//true
		System.out.println(p3.test("Venkatanagasrikanth", "C"));//false
		
		System.out.println("Main Method Ended");
	}
}
