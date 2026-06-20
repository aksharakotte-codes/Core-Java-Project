package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparableDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Mobile m1 = new Mobile("Pro-Max","Apple", 140000.00);
		Mobile m2 = new Mobile("10R","One Plus",40000.00);
		Mobile m3 = new Mobile("Ultra-Pro","Apple", 160000.00);
		Mobile m4 = new Mobile("10T","One Plus",60000.00);
		
		List<Mobile> mobList = new ArrayList<>();
		
		mobList.add(m1);
		mobList.add(m2);
		mobList.add(m3);
		mobList.add(m4);
		
		Comparator<Mobile> c = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if(o1.price < o2.price) {
					return -1;
				} else if(o1.price > o2.price) {
					return +1;
				} else {
					return 0;
				}
			}
			
		};
		
		Collections.sort(mobList, c);
		
		for(Mobile m : mobList) {
			System.out.println(m);
		}
		
		System.out.println("Main Method Ended!!");
	}

}
