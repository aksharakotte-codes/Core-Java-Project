package com.languagefundamentals.constructors.chainingex;

public class Student1 {

		String name;
		int age ;
		
		
//		Student Created 
		Student1() {
			this("Unknown");
			System.out.println("Student Created !!");
			
		}
		
//		One-arg Constructor
		Student1(String name){
			this(name, 0);
			System.out.println("One-arg Constructor Called!!");
		}
		
//		Two-arg Constructor 
		Student1(String name, int age){
			System.out.println("Two-arg Constructor Called!!");
			this.name = name;
			this.age = age;
		}

		public static void main(String[] args) {
			System.out.println("Main Method started!!");
			
			Student1 s1 = new Student1();
			System.out.println("Student's name : " + s1.name);
			System.out.println("********************************");

			
			Student1 s2 = new Student1("Akshara");
			s2.display();
			
			Student1 s3 = new Student1 ("Akshara", 21);
			s3.display();
			
			System.out.println("Main Method ended!!");

		}
		void display() {
			System.out.println("Student's Name : " + name);
		    System.out.println("Student's Age:" + age);
		    System.out.println("***************************************");
		}
		
}
