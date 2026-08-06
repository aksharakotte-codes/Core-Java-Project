package com.java8features.streams;

//FlatMap -> Flatten Nested Lists

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("a", "b"),
				Arrays.asList("c", "d"),
				Arrays.asList("e")
				);
		
		List<String> flatList = nestedList.stream()
				                .flatMap(List::stream)
				                .collect(Collectors.toList());
		System.out.println(flatList);// [a, b, c, d, e]
		
		System.out.println("*****************************");
		
		List<List<String>> list = Arrays.asList(
				Arrays.asList("Srikranth", "Java"),
				Arrays.asList("Vishwanath", "SQL"),
				Arrays.asList("VCube", "JFS")
				);
		
		List<String> flatMap = list.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(flatMap);// [Srikranth, Java, Vishwanath, SQL, VCube, JFS]
		
		System.out.println("Main Method Ended");
	}

}
