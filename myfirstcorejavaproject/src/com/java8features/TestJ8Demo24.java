package com.java8features;

import java.util.function.BiConsumer;

public class TestJ8Demo24 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		BiConsumer<Integer, Integer> bic = (i1, i2) -> {
			System.out.println(i1 + i2); // 10 + 20 = 30
			System.out.println(i1 * 10 + 100);// 10 * 10 + 100 = 200
		};
		bic.accept(10, 20);
		
		System.out.println("Main Method Ended");
	}

}
