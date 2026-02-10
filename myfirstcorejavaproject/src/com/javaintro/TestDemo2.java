package com.javaintro;

public class TestDemo2 {
	static TestDemo2 t = new TestDemo2();
//	Main Method
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
	}	

	
//	Static block
	static {
		System.out.println("Static Block called");
	}
	
//	Instance block
	{
		System.out.println("Instance Block called");
	}


	
}
