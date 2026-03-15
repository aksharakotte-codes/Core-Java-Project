package com.languagefundamentals.constructors.chainingex;
//Parent
public class Student2 {
	
	String name;
	int rollNo;
	String course;
	
	Student2() {
		System.out.println("Student2 No-arg Consructor called!!");
	}
	Student2(String name, int rollNo, String course) {
		System.out.println("Student2 Parameterized Constructor called!!");
		
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}

	public static void main(String[] args) {
		System.out.println("Main Method started from Student2!!");

	}

}
//child class
class GraduateStudent extends Student2 {
	
	GraduateStudent() {
		super();
		System.out.println("GraduateStudent No-arg Constructor called!!");
	}
	
	GraduateStudent(String name, int rollNo, String course) {
		super(name, rollNo, course);
		System.out.println("GraduateStudent Parameterized Constructor called!!");
	}


	public static void main(String[] args) {
		System.out.println("Main Method started from GraduateStudent!!");
		
		GraduateStudent gs1 = new GraduateStudent();
		gs1.printInfo();
		
		GraduateStudent gs2 = new GraduateStudent("Akshara", 587, "CSE");
		gs2.printInfo();
		
	}
	
	void printInfo() {
		System.out.println("Name of the Student:" + name);
		System.out.println("Roll No of the Student:" + rollNo);
		System.out.println("Course of the Student:" + course);
		System.out.println("***************************************");
	}
}