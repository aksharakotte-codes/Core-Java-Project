package com.java8features;
//The Method can take two int values

@FunctionalInterface
interface In7 {
	public void m1(int a, int b);
}


public class TestJ8Demo8 {

	public static void main(String[] args) {
        System.out.println("Main Method Started");
		
		In7 t = (a, b) -> System.out.println("Hello" + " " + (a + b));
		t.m1(10, 20);
		
		System.out.println("Main Method Ended");

	}

}
