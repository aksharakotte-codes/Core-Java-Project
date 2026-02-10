package com.javaintro;

public class Example1 {
	static int x = 100;
	static {
        x = 20;
        System.out.println("Static Block: " + x);
    }
	public static void main(String[] args) {
		System.out.println("Main Method:" + x);

	}

}
