package com.java8features;
//Lambda Expressions vs Collections

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestJ8Demo12 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<Integer> al = Arrays.asList(10, 3, 20, 2, 30, 5, 40, 50);
		
		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
		Collections.sort(al, c);
		System.out.println(al);
		
		System.out.println("Main Method Ended");
	}

}
