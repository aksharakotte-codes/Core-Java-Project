package com.java8features;

@FunctionalInterface
interface In4 {
	double multiplication(int a, int b, int c);
}

public class TestJ8Demo4 {

	public static void main(String[] args) {
        System.out.println("Main method Started");
		
		In4 i = (l, m, n) -> {
			double mul = l * m * n;
			return mul;
		};
		System.out.println(i.multiplication(10, 15, 18));//2700.0
		
		System.out.println("Main method Ended");

	}

}
