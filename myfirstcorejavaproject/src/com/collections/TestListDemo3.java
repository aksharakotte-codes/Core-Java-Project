package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		List<Integer> li = new ArrayList<>();
		li.add(7);
		li.add(18);
		li.add(45);
		li.add(4);
		li.add(1);
		li.add(5);
		li.add(8);
		li.add(8);
		li.add(8);
		li.add(8);
		
		List<Integer> subLi= li.subList(0, 4);
		subLi.add(99);
		subLi.add(101);
		System.out.println(subLi);//Prints 0 to 3 indexes
		
		System.out.println(li.indexOf(8));//First Index of 8
		System.out.println(li.lastIndexOf(8));//Last Index of 8
		System.out.println(li.remove(li.indexOf(8)));
		System.out.println(li);
		System.out.println("Main Method Ended");

	}

}
