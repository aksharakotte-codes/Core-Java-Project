package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Collection<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Banana"); 
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Pineapple");
		System.out.println("Size of the Fruits :" + fruits.size());
		System.out.println(fruits);
		
//		Returns an array containing all of the elements in this collection
		Object[] obj = fruits.toArray();
		for(Object objs : obj) {
			System.out.println(objs);
		}
		
		System.out.println("-----------------------------");
		Collection<String> veggies = new ArrayList<>();
		veggies.add("Potato");
		veggies.add("Tomato");
		veggies.add("Carrot");
		veggies.add("Beetroot");
		veggies.add("Banana");
		
//		Retains only the elements in this collection that are contained in the specified collection 
		System.out.println(fruits.retainAll(veggies));//true
		System.out.println(fruits);//[Banana]
	}

}
