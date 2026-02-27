package com.languagefundamentals.methods;

//1)  No Arguments + No Return Type
//Write a program to calculate two numbers and prints the same.


//addition()  --> +
//subtraction() --> -
//multiplication() --> *
//division() --> /
//modulus() --> %
public class TestMethodsDemo1 {
	
	void addition() {
		int a = 10;
		int b = 20;
		System.out.println("Addition:");
		System.out.println(a + b);
	}
	
	void subtraction() {
		int a = 100;
		int b = 200;
		System.out.println("Subtraction:");
		System.out.println(a - b);
	}
	
	void multiplication() {
		int a = 1000;
		int b = 7890;
		System.out.println("Multiplication:" +a * b);
	}
	
	void division() {
		int a = 100;
		int b = 4;
		System.out.println("Division:"+a / b);
	}
	
	void modulus() {
		int a = 99;
		int b = 5;
		System.out.println("Modulus:"+a % b);
	}
	//Instance method
	void greet() {
		System.out.println("Good morning, Have a nice day !!");
		addition();
		subtraction();
		multiplication();
		division();//Quotient
		modulus();//Remainder
	}
    
	//Static Method 
	static void welcome() {
		System.out.println("Welcome to Methods !!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
//		Cannot make a static reference to the non-static method greet() from the type TestMethodsDemo1 
//       greet(); // calling the method
		
//		If we want to call instance methods inside a static area,
//		we must need to create a Object of a class and we can call by using Object Reference Variable
		TestMethodsDemo1 t1 = new TestMethodsDemo1();
		t1.greet();
		
//		static methods we can call directly
//		And also we can call by using class name
		welcome();
		TestMethodsDemo1.welcome();
		
		System.out.println("Main Method Started!!!");
		
	}
}
