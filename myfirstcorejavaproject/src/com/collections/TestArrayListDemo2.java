package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Student s1 = new Student(1, "Kohil", 38, 9189189189L);
		Student s2 = new Student(2, "Rohit", 37, 9189191842L); 
		Student s3 = new Student(3, "Lokesh", 58, 9189189101L);
		Student s4 = new Student(4, "Rahul", 35, 9189189188L);
		Student s5 = new Student(5, "Ashrith", 21, 9182991299L);
		List<Student> li = new ArrayList<>();
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		//System.out.println(li);
		for (Student s : li) {
			System.out.println(s);
		}
		System.out.println("Main Method Ended");

	}

}
