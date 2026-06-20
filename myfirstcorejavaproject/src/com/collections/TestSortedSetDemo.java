package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetDemo {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		SortedSet ss = new TreeSet<>();
//		ss.add("Srikanth");
//		ss.add("Java");
//		ss.add(10);
//		ss.add(9);
//		System.out.println(ss);
		System.out.println("**********************");
		
//		SortedSet : A Set that further provides a total ordering on its elements.
		SortedSet<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(45);
		s.add(18);
		s.add(7);
		s.add(0);
		s.add(1);
		s.add(9);
		s.add(15);
		s.add(10);
		s.add(10);
		
		System.out.println(s);//0, 1, 7, 9, 10, 15, 18, 45
		
		System.out.println(s.first());//0
		System.out.println(s.last());//45
		System.out.println(s.headSet(18));//0, 1, 7, 9, 10, 15
		System.out.println(s.tailSet(18));//18, 45
		System.out.println(s.subSet(7, 18));//7, 9, 10, 15

		System.out.println("Main Method Ended");
	}

}
