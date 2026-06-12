package com.collections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
//		Constructs an empty list
		List<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(9);
		l.add(18);
		l.add(8);
		l.add(15);
		l.add(10);
		l.add(null);
		l.add(null);
		l.add(100);
		
		l.addFirst(90);
		l.addLast(500);
		System.out.println(l);
		System.out.println(l.reversed());          
	}

}
