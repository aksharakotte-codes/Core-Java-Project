package com.java8features;
//Default method and Static Methods

interface MyInterf {
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
	
//	void method4() {
//		
//	}
	default void method5() {
		System.out.println("Hello Method 5");
	}
	static void method6() {
		System.out.println("Hello Static Method");
	}
}

public class TestJ8Demo14 implements MyInterf {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		TestJ8Demo14 t = new TestJ8Demo14();
		t.method1();
		t.method5();
		
//		MyInterf m = new TestJ8Demo14();
		t.method2();
		t.method3();
		MyInterf.method6();
		
		System.out.println("Main Method Ended");
	}
	public static void method6() {
		System.out.println("Hello Method 6");
	}
	@Override
	public void method1() {
		System.out.println("Hello Method 1");
	}

	@Override
	public void method2() {
		System.out.println("Hello Method 2");
	}

	@Override
	public void method3() {
		System.out.println("Hello Method 3");
	}

}
