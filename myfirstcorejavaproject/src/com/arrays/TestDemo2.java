package com.arrays;

public class TestDemo2 {
	
	int x = show();
	
	TestDemo2(){
		System.out.println("Constructor called");
	}
	{
		System.out.println("Instance block Called");
	}
	int show() {
		System.out.println("show");
		return 10;
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		TestDemo2 obj = new TestDemo2();

        System.out.println("Main Method Ended");

	}

}
