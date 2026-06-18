package com.collections;

import java.util.Iterator; 
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class TestCopyOnWriteArrayListDemo {

	public static void main(String[] args) {
        List<Integer> li = new CopyOnWriteArrayList<>();
		 
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
//		A thread-safe variant of java.util.ArrayList in which all mutative operations (add, set, and so on) are implemented by making a fresh copy of the underlying array.
//		Fail Safe with CopyOnWriteArrayList
		Iterator<Integer> itr = li.iterator();
		while(itr.hasNext()) {
		    System.out.println(itr.next());
		    li.add(100);
		}
//		Fail Fast with ArrayList
//		Iterator<Integer> itr = li.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			li.add(100);
//		}
		
//		Fail Fast
//		for(Integer i : li) {
//			System.out.println(i + " ");
//			li.add(60);
//		}
		
		System.out.println(li);

	}

}
