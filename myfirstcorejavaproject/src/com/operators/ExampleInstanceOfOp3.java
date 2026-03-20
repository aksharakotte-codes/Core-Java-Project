package com.operators;
//Parent Reference Example of Instance of Operators
class Animal1 {
	
}
class Dog1 extends Animal1 {
	
}
class Cat extends Animal1 {
	
}
public class ExampleInstanceOfOp3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Animal1 d = new Dog1();// Parent reference holding Dog object
		
		System.out.println(d instanceof Dog1);//true --> actually Dog
		System.out.println(d instanceof Cat);//false --> not Cat
		System.out.println(d instanceof Animal1);//true --> Dog is an Animal
	}

}
