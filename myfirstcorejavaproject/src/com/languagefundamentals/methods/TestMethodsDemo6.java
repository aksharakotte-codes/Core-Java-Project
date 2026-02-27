package com.languagefundamentals.methods;

//with argument + no return type
//With static method

public class TestMethodsDemo6 {

	public static void main(String[] args) {
System.out.println("Main method started!!");
		
//      Call by Value 
		greet("Good morning,Have a nice day !!");
		addition(100, 200);//300
		subtraction(4000.0F,6000.986);//-2000.9859999999999
		multiplication(23445, 235.098F);//5511873.0
		division(64, 345.0F);//0.18550725
		modulus((byte)18, 14);

	}
	
	static void greet(String wish) {
		System.out.println("Greeting : " + wish);
	}
	
	static void addition(int a, int b) {
		System.out.println("In Addition :" + (a + b));
	}
	
	 static void subtraction(float a, double b) {
		System.out.println("In Subtraction :" + (a - b));
	}
	
	static void multiplication(int a, float b) {
		System.out.println("In Multiplication :" + (a * b));
	}
	
	static void division(int a, float b) {
		System.out.println("In Division :" + (a / b));
	}
	
	static void modulus(byte a, int b) {
		System.out.println("In Modulus :" + (a % b));
	}

}
