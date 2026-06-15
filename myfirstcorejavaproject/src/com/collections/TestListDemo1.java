package com.collections;

//IndexbasedList Interface

import java.util.ArrayList;
import java.util.List;

public class TestListDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<Integer> list = new ArrayList<>();
		
		list.add(0, 1);
		list.add(1, 20);
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(40);
		list.add(3, null);
		list.add(null);
		list.add(null);
		list.add(null);
		
		System.out.println(list);
	}

}
