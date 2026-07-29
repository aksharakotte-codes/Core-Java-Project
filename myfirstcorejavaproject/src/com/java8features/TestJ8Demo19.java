package com.java8features;

import java.util.function.Function;

public class TestJ8Demo19 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = (i) -> i * 2;
		Function<Integer, Integer> f2 = (i) -> i * i * i;
		
		System.out.println(f1.andThen(f2).apply(5));//1000
		System.out.println(f1.compose(f2).apply(5));//250

	}

}
