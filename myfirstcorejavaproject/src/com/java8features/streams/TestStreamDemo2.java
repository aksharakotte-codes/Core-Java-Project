package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<Integer> l1 = Arrays.asList(10, 7, 45, 18, 1, 4, 8);
		
		List<Integer> l2 = l1.stream()
				.filter(a -> a % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(l2);//[10, 18, 4, 8]
		
		System.out.println("**********************************");
		
		List<String> l3 = Arrays.asList("Sachin", "Dhoni", "Rohit", "Kohil", "Rahul", "Abhishek", "Jadeja");
		List<String> l4 = l3.stream()
		                    .filter(s -> !s.contains("oh"))
		                    .collect(Collectors.toList());
		System.out.println(l4);//[Sachin, Dhoni, Rahul, Abhishek, Jadeja]
		
		System.out.println("Main Method Ended");
	}

}
