package com.java8features;

import java.util.function.Supplier;

public class TestJ8Demo21 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Supplier<Integer> s = () -> {
			int a = 100;
			int b = 200;
			int mul = a * b;
			return mul;
		};
		
		System.out.println(s.get());//20000
		System.out.println("Main Method Ended");
	}

}
