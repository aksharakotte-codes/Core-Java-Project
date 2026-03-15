package com.languagefundamentals.constructors;

class Animal1 {
	String name;
	int age;
	
	public Animal1() {
		System.out.println("Animal1 No-arg Contructor Called!!!");
	}
}

class Monkey extends Animal1{
	
	public Monkey() {
		super();//this is by default or else we can create on our own 
		System.out.println("Monkey No-arg constructor called!!");
	}
}
public class TestConChDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Monkey m1 = new Monkey();
		
		System.out.println("Main Method Ended");
	}

} 