package com.java8features;
//OneArguments

@FunctionalInterface
interface In2 {
	void sqrt(int n);
}

public class TestJ8Demo2 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		In2 i = n -> System.out.println(n*n);
		
//		In2 i = (int n) -> {
//			System.out.println(n * n);
//		};
		i.sqrt(10);
		
		System.out.println("Main method Ended");

	}

}
