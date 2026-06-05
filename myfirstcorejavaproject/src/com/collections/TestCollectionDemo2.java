package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("Virat");
		batsmens.add("Rohit");
		batsmens.add("Iyer");
		batsmens.add("Dhoni");
		batsmens.add("Tilak");
		batsmens.add("Vaibhav");
		batsmens.add("Gill");
		batsmens.add("Rahul");
		System.out.println("Batsmens : " + batsmens);
		
		Iterator<String> itr =  batsmens.iterator();
		
//		Returns true if the iteration has more elements.
		while(itr.hasNext()) {
//			Returns the next element in the iteration.
			
			
			System.out.println(itr.next());
		}
		
		System.out.println("***********************");
//		Enhanced for loop or for each loop
		for(String batsmens1 : batsmens) {
			System.out.println(batsmens1);
		}
	}
}
