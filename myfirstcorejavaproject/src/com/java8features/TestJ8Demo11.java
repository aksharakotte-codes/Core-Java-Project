package com.java8features;
//Functional Interface vs Inheritance

//Functional Interface with respective of Inheritance

@FunctionalInterface
interface In10 {
	void method1();
}

//Invalid '@FunctionalInterface' annotation; In11 is not a functional interface
//@FunctionalInterface
//interface In11 extends In10 {
//	void method2();
//}
public class TestJ8Demo11 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		
		
		System.out.println("Main Method Ended!!");
	}

}
