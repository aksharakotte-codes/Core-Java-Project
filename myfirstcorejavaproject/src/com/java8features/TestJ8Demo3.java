package com.java8features;
//Two Arguments

@FunctionalInterface
interface In3 {
	void addition(int a, int b);
}

public class TestJ8Demo3 {

	public static void main(String[] args) {
        System.out.println("Main method Started");
		
		In3 i = (a, b) -> {
			int sum = a + b;
			System.out.println("Addition of Two Values : " + sum);
		};
		i.addition(100, 200);// 300
		
		System.out.println("Main method Ended");

	}

}
