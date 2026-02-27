package com.languagefundamentals.methods;

import java.util.Scanner;
public class TestMethodsDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method started!!!");
		
		
//		In scanner class .there is no no-arg constructor,
//		So we are unable to create objects for Scanner directly like below.
//		So we must need to pass arguments in it.
//		Scanner sc = new Scanner();
		
//		Constructors a new Scanner that produces values scanned from the specified input stream
//		To read the elements from Console directly
		Scanner sc = new Scanner(System.in);//Parameter constructor
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		
		System.out.println("Enter your First Name :");
		String firstname= sc.next();
		System.out.println("Enter your Last Name :");
		String lastname = sc.next();
		
//		Default Constructor (provided by compiler)
		TestMethodsDemo7 t = new TestMethodsDemo7();
		t.getEmployee(age);
		t.getEmployeeFullName(firstname, lastname);
		
//		No-Argument Constructor (explicitly defined in class)
//		String s = new String();
		sc.close();
		
	}
	
	void getEmployee(int age) {
		System.out.println("Employee age is:" + age);
	}
	
    void getEmployeeFullName(String fn,String ln) {
    	System.out.println("FullName of Employee is :" + fn + " " + ln);
    }

}
