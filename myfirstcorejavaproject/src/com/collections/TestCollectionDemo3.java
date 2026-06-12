package com.collections;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo3 {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!");
		
		Collection<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
//		for(int n : numbers) {
//			if(n == 20) {
//				numbers.remove(n);
//			}
//		}
		
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			if(i == 20) {
				itr.remove();
			}
		}
//		numbers.removeIf(i -> i==20);
		System.out.println(numbers);
	}

}
