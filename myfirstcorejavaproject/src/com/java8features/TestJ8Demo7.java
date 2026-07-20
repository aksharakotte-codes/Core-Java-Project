package com.java8features;
//Simple Hello Program

@FunctionalInterface
interface In6 {
	public void m1();
}

public class TestJ8Demo7 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		In6 t = () -> System.out.println("Hello");
		t.m1();
		
		System.out.println("Main Method Ended");
	}

}
