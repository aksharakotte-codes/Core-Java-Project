package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int sum = numbers.stream()
				         .filter(n -> n % 2 == 0)
				         .map(n -> n * n)
				         .reduce(0, Integer::sum);
		System.out.println("Sum of the All the Numbers is : " + sum);//56
		
		System.out.println("**********************************");
		
        List<String> names = Arrays.asList("java", "srikanth", "vcube");
		
		List<String> upperNames = names.stream()
				                         .map(String::toUpperCase)
				                         .collect(Collectors.toList());
		
		upperNames.forEach(System.out::println);
		
		System.out.println("**********************************");
		
		List<String> fruits = Arrays.asList("Mango", "Banana", "Apple", "Orange");
		
		List<String> sorted = fruits.stream()
				                    .sorted()
				                    .collect(Collectors.toList());
		
		sorted.forEach(System.out::println);
		
		System.out.println("**********************************");
		
		long count = Stream.of("banana", "apple", "cherry")
		       .filter(s -> s.length() > 5)
		       .count();
		        System.out.println(count);// 2
		
		System.out.println("Main Method Ended");
		
	}
}