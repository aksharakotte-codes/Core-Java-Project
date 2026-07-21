package com.java8features;

//Predefined Functional Interfaces 

//Predicate<T> --> boolean test(T t)
//Input as datatype, and returns boolean

import java.util.function.Predicate;

public class PredefinedFunctional01 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Predicate<Integer> p1 = (a) -> a > 18;//Returns boolean type
		System.out.println(p1.test(22)); // true
		System.out.println(p1.test(17)); // false
		
		System.out.println("-----------------------------------");
		
		Predicate<String> p2 = (s) -> s.contains("s");//Returns boolean type
		System.out.println(p2.test("Akshara")); // true
		System.out.println(p2.test("Srikanth")); // false
		
		
		System.out.println("Main Method Ended");
	}

}
