package com.collections;
//Arrays vs Collection
import java.util.Collection;
import java.util.ArrayList;

public class CollectionInteger1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		//Array
		Object[] obj = new Object[5];
		
		obj[0] = 10;
		obj[1] = "Akshara";
		obj[2] = 5.8;
		obj[3] = 100000.0;
		obj[4] = 'c';
		
		for(Object o:obj) {
			System.out.println(o);
		}
		
		System.out.println("--------------------------");
		
//		Collection is a raw type. 
//		References to generic type Collection<E> should be parameterized.
		Collection<Integer> c = new ArrayList<>();
		
		c.add(9);
		c.add(2);
		c.add(99);
		c.add(72);
		c.add(92);
		c.add(97);
		c.add(97);//Allows duplicate values
		c.add(97);
		c.add(7);
		
		System.out.println(c);
	}

}
