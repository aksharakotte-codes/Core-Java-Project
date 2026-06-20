package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSetDemo {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(100);
		ns.add(300);
		ns.add(400);
		ns.add(500);
		ns.add(700);
		ns.add(200);
		ns.add(1000);
		ns.add(900);
		
//		Returns the greatest element in this set less than or 
//		equal to the given element, or null if there is no such element.
		System.out.println(ns.floor(450));//400
//		Returns the least element in this set greater than or 
//		equal to the given element, or null if there is no such element.
		System.out.println(ns.ceiling(850));//900
		System.out.println(ns.ceiling(1050));//null
		System.out.println(ns.lower(400));//300
		System.out.println(ns.higher(700));//900
		System.out.println(ns);
		System.out.println("Main Method Ended");
	}

}
