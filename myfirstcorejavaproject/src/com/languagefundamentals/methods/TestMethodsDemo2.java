package com.languagefundamentals.methods;

//1)  No Arguments + No Return Type
//Write a program to calculate two numbers and prints the same.


//addition()  --> +
//subtraction() --> -
//multiplication() --> *
//division() --> /
//modulus() --> %
public class TestMethodsDemo2 {
	
	void addition() {
		int a = 10;
		int b = 20;
		System.out.println("Addition:"+(a + b));//BODMAS // 30
	}
	
	void subtraction() {
		int a = 100;
		int b = 200;
		System.out.println("Subtraction:"+(a - b));//-100
	}
	
	void multiplication() {
		int a = 1000;
		int b = 7890;
		System.out.println("Multiplication:" +a * b);//7890000
	}
	
	void division() {
		int a = 100;
		int b = 4;
		System.out.println("Division:"+a / b);//25
	}
	
	void modulus() {
		int a = 99;
		int b = 5;
		System.out.println("Modulus:"+a % b);//4
	}


   void main(String[] args) {
		
		System.out.println("Main Method started!!!");
		addition();
		subtraction();
		multiplication();
		division();//Quotient
		modulus();//Remainder
		

	}

}
