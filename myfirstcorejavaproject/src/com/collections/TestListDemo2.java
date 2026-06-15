package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
        List<String> girls = new ArrayList<>();
		
	    girls.add(0,"Akhi");
	    girls.add("Akshara");
	    girls.add("Honey");
	    girls.add("Vyshuu");
	    
		
		List<String> boys = new ArrayList<>();
		
		boys.add(0,"Ashrith");
		boys.add("Rahul");
		boys.add(0,"Sai");
		boys.add("Pranay");
		boys.add("Ruthwik");
		boys.add("Siddu");
		boys.add("Rohan");
		boys.add(1,"Anjan");
		boys.add(null);
		boys.add(null);
		
        List<String> students = new ArrayList<>();
		
		students.addAll(boys);
		students.addAll(girls);
		
        List<String> trainers = new ArrayList<>();
		trainers.add("Srikanth");
		trainers.add("Vishwanath");
		
		students.addAll(1,trainers);
		System.out.println("Total Students and Trainers : " + students);
		System.out.println("**********************");
		
		System.out.println(boys);
//		Replaces the element at the specified position in this list with the specified element.
		System.out.println(boys.set(0,"Abhi"));
		System.out.println("Total Boys : " + boys);
		
		System.out.println("***********************");
//		Iterating the collections in 3 ways
//		1st way
		for(int i = 0; i < boys.size();i++) {
			System.out.println(boys.get(i));
		}
		System.out.println("***************************");
//		2nd way
		for(String b : boys) {
			System.out.println(b);
		}
		System.out.println("***************************");
//		3rd way or  best way
		Iterator<String> it = boys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Main Method Ended");

	}

}
