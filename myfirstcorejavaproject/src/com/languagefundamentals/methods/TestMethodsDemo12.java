package com.languagefundamentals.methods;
//SRS: Service Requirement Specification
interface In1 {
//	Abstract methods do not specify a body
//	void method() {
//		
//	}
//	Abstract Method: Which Does not provide implementation
	public abstract void method2();
}
class Student {
	String name;
}
public class TestMethodsDemo12 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
	   	Student s1 = createStudent();
		s1.name = "Akshara";
		System.out.println(s1.name);
	}
	
	static Student createStudent() {
		Student s = new Student();
		return s;
	}
}
