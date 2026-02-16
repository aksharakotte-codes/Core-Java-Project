package com.languagefundamentals;

//Identifiers Concept

/* Identifiers:Identifiers is a name of packages,class,methods,
variables or any will consider as Identifier. */

//How many identifiers are there in this above program
// 15 identifiers are there
/*
1)com
2)languagefundamentals
3)Student_1
4)college_Name
5)college_id
6)student_id
7)student_Name
8)String
9)main
10)args
11)System
12)out
13)println
14)s1
15)show$ */
public class Student_1 {
	
	static String college_Name =  "Vcube";
	static int college_id = 111;
	
	int student_id;
	String student_Name;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Student_1 s1 = new Student_1();
		System.out.println(s1.student_id);
		System.out.println(s1.student_Name );
		s1.show$();
	}
	
	void show$() {
		System.out.println("Show Method Called");
	}

}
