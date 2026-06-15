package com.collections;

import java.util.ArrayList;

public class TestArrayListDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		Constructs an empty list with an initial capacity of ten
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(null);
//		When we add more than 10 elemnts, 
//		while adding 11th element internally Re-sizing with 15
//		Formula : Current_Capacity * 3/2
		al.add(4);
		System.out.println(al.size());//11
		System.out.println(al);
	}

}
