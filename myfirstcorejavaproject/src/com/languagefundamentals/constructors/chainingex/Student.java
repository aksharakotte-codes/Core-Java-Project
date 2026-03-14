package com.languagefundamentals.constructors.chainingex;

public class Student {

	String name;
	int rollNo;
	String course;
	double fees ;
	
	
//	No-arg Constructor
	Student() {
		this("Unknown");
		System.out.println("No-arg Constructor Called!!");
		
	}
	
//	One-arg Constructor
	Student(String name){
		this(name, 0);
		System.out.println("One-arg Constructor Called!!");
	}
	
//	Two-arg Constructor 
	Student(String name, int rollNo){
		this(name, rollNo, "Java");
		System.out.println("Two-arg Constructor Called!!");
	}
	
//	Three-arg Constructor
	Student(String name, int rollNo, String course){
		this(name,rollNo, course, 500000.0);
		System.out.println("Three-arg Constructor Called!!");
	}
	
//	Four-arg Constructor
	Student(String name, int rollNo, String course, double fees){
		System.out.println("Four-arg Constructor Called!!");
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
		this.fees = fees;
	}
	public static void main(String[] args) {
		System.out.println("Main Method started!!");
		
		Student c1 = new Student();
		System.out.println("Student's name : " + c1.name);
		System.out.println("********************************");

		
		Student c2 = new Student("Unknown", 0);
		System.out.println("Student's name : " + c2.name);
		System.out.println("Student's RollNo : " + c2.rollNo);
		System.out.println("************************************");
		
		
		Student c3 = new Student ("Unknown", 0, "Java");
		System.out.println("Student's name : " + c3.name);
		System.out.println("Student's RollNo: " + c3.rollNo);
		System.out.println("Student's Course : " + c3.course);
		System.out.println("***********************************");
		
		Student c4 = new Student("Unknown", 0, "Java", 500000.0);
		c4.studentInfo();
		
		
		Student c5 = new Student("Akshara", 587, "JFS", 280000.0);
		c5.studentInfo();
		
		System.out.println("Main Method ended!!");

	}
	void studentInfo() {
	     System.out.println("Student's name : " + name);
	     System.out.println("Student's RollNo:" + rollNo);
	     System.out.println("Student's Course : " + course);
	     System.out.println("Student's Fee : " + fees);
	     System.out.println("***************************************");
	  
     }
}
