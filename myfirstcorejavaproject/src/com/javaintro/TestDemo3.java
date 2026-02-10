package com.javaintro;

public class TestDemo3 {
	 public static void show() {
		 System.out.println(Thread.currentThread());
		 System.out.println("show method called");
		 System.out.println("show method called");
		 System.out.println("show method called");
		 
	 }

//	public static void main(String[] args) {
//		System.out.println("Main started");
//	}
		
	void main() {	
		System.out.println(Thread.currentThread());
		System.out.println("Main method started!!");
//		calling the static method
		show();
		
//		Calling the instance method
		TestDemo3 t = new TestDemo3();
		t.hello();
	}
	
	public void hello() {
		System.out.println(Thread.currentThread());
		System.out.println("Hello method called");
		System.out.println("Hello method called");
		System.out.println("Hello method called");
	}

}
