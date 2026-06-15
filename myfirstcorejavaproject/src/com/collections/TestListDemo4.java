package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Pineapple");
		
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("************************");
		List<String> veggies = new ArrayList<>();
		veggies.add("Potato");
		veggies.add("Tomato");
		veggies.add("Banana");
		
		ListIterator<String> litr = veggies.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("-----------------------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		System.out.println("Main Method Ended");

	}

}
