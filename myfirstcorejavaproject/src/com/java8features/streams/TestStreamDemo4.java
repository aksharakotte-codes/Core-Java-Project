package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<String> names = Arrays.asList("Java", "JDBC", "JBA", "J2EE", "Spring", "Spring Boot");
		
		List<String> filteredNames = names.stream()
				                         .filter(s -> s.toLowerCase().startsWith("j"))
				                         .sorted()
				                         .collect(Collectors.toList());
		
		filteredNames.forEach(System.out::println);
		
		System.out.println("*************************************");
		
		List<String> updatedNames = names.stream()
				                         .map(s -> s.concat("-VCUBE"))
				                         .sorted()
				                         .distinct()
				                         .limit(3)
				                         .toList();
		updatedNames.forEach(System.out::println);

		System.out.println("Main Method Ended");
	}
}