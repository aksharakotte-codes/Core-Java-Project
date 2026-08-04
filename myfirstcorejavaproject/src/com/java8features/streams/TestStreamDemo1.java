package com.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(7);
		l.add(18);
		l.add(45);
		l.add(1);
		l.add(30);
		l.add(4);
		l.add(8);
		
		System.out.println(l);
		
		Stream<Integer> s = l.stream();
		Stream<Integer> s1 = s.filter(i -> i % 2 == 0);
		
		List<Integer> l2 = s1.collect(Collectors.toList());
		
		System.out.println(l2);
		
		System.out.println("Main Method Ended");
	}
}
