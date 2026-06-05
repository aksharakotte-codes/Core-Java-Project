package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo1 {

	public static void main(String[] args) {
		
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(20);
		System.out.println(c1.hashCode());
		System.out.println(c1);
		
//		hashCode = 1 
//
//		hashCode = 31 * 1 + 10
//				         = 41
//
//		hashCode = 31 * 41 + 20
//				         = 1291
		
		Collection<Integer> c2 = new ArrayList<>();
		c2.add(10);
		c2.add(20);
		System.out.println(c2.hashCode());
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));

	}

}
