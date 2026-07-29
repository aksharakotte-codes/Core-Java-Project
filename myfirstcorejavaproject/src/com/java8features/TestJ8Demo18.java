package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class InfoStudent1 {
	String name;
	double marks;
	
	public InfoStudent1(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}
}
public class TestJ8Demo18 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Akshara", 95);
		Student s2 = new Student("Vinay", 85);
		Student s3 = new Student("Swamy", 75);
		Student s4 = new Student("Sai Teja", 100);
		Student s5 = new Student("Pramodh", 70);
		Student s6 = new Student("Srikanth", 40);
		
		Student[] students = {s1, s2, s3, s4, s5, s6};
		
		Function<Student, String> f1 = (st) -> {
			String grade = "";
			
			if(st.marks > 100 || st.marks < 0) {
				grade = null;
			}else if(st.marks >= 90) {
				grade = "Grade A";
			}else if(st.marks >= 80) {
				grade = "Grade B";
			}else if(st.marks >= 70) {
				grade = "Grade C";
			}else if(st.marks >= 60) {
				grade = "Grade D";
			}else if(st.marks >= 35) {
				grade = "Just Passed";
			}else {
				grade = "Failed";
			}
			return grade;
		};
		
		Predicate<Double> p1 = m -> m >= 75;
		
		Supplier<Date> su = () -> new Date();
		
		Consumer<Student> c1 = (s) -> {
			System.out.println("Name of the Student : " + s.name);
			System.out.println("Marks Percentage of the Student : " + s.marks);
			System.out.println("Grade of the Student : " + f1.apply(s));
			System.out.println(su.get());
			System.out.println("--------------------------");
		};
		
		for(Student s : students) {
			if(p1.test(s.marks)) {
				c1.accept(s);
			}
		}
	}

}
