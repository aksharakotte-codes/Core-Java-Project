package com.languagefundamentals.methods;

//with argument + no return type
//Instance method with creating object 
public class TestMethodsDemo5 {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		TestMethodsDemo5 t1 = new TestMethodsDemo5();
		t1.greet("Good morning,Have a nice day !!");
		t1.addition(100, 200);//300
		t1.subtraction(4000.0F,6000.986);//-2000.9859999999999
		t1.multiplication(23445, 235.098F);//5511873.0
		t1.division(64, 345.0F);//0.18550725
		t1.modulus((byte)18, 14);

	}
	
	void greet(String wish) {
		System.out.println("Greeting : " + wish);
	}
	
	void addition(int a, int b) {
		System.out.println("In Addition :" + (a + b));
	}
	
	void subtraction(float a, double b) {
		System.out.println("In Subtraction :" + (a - b));
	}
	
	void multiplication(int a, float b) {
		System.out.println("In Multiplication :" + (a * b));
	}
	
	void division(int a, float b) {
		System.out.println("In Division :" + (a / b));
	}
	
	void modulus(byte a, int b) {
		System.out.println("In Modulus :" + (a % b));
	}
}
