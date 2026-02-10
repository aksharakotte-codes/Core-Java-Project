package com.javaintro;

public class Example2 {

	static {
        System.out.println("Static Block 1");
    }

    {
        System.out.println("Instance Block 1");
    }

    Example2() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static Block 2");
    }

    {
        System.out.println("Instance Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        Example2 e = new Example2();
        System.out.println("Main End");
    }

}
