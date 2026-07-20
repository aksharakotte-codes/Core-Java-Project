package com.java8features;
//No Arguments

//If you have 2 abstract methods in interface
//Invalid '@FunctionalInterface' annotation; 
//In1 is not a functional interface

//@FunctionalInterface : FI means, which contains only one Abstract Method

//Note : lambda Expressions works with only Functional Interfaces but not in all the places;
//So if you want to work with Lambda Expressions, we must need to have Functional Interfaces
//Lambda Expressons introduces to achieve concise coding or smart coding

@FunctionalInterface
interface In1 {
	void method1();
//	void method2();
}

public class TestJ8Demo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		In1 i = () -> System.out.println("Method1 Called");
		
		i.method1();
		
		System.out.println("Main Method Ended!!");
	}

}
