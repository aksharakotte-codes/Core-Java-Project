package com.java8features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestJ8Demo23 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Function<Integer, String> f1 = (i) -> {
			String info = "";
			
			if(i > 18) {
				info = "Eligible";
			} else {
				info = "Not Eligible";
			}
			return info;
		};
		
		System.out.println(f1.apply(21));//Eligible
		
		BiFunction<String, String, Integer> bif = (s1, s2) -> s1.length() + s2.length();
		System.out.println(bif.apply("Javais", "Simple"));//12
		System.out.println("Main Method Ended");
	}

}
