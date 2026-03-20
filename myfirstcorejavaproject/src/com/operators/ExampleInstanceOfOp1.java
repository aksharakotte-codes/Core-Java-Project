package com.operators;
class Animal{
	
}
class Dog extends Animal {
	
}
public class ExampleInstanceOfOp1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Dog d = new Dog();
		
		System.out.println(d instanceof Animal);//true
		System.out.println(d instanceof Dog);//true
	}

}
