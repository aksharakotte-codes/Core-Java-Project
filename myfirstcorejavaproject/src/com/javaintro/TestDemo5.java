package com.javaintro;

// NOTE: If we want to call instance method into static area,
// we must need to create objects.
public class TestDemo5 {
	static TestDemo5 t = new TestDemo5();

	
	void hello5() {
		System.out.println("Method5 called");
	}
	
	static void hello3() {
		System.out.println("Method3 called");
		TestDemo5 t = new TestDemo5();
		t.hello5();
	}
	
	 void hello4() {
		System.out.println("Method4 called");
		
	}
	
	
	static void hello1() {
		System.out.println("method1 called");
		TestDemo5 t = new TestDemo5();
		t.hello2();

	}
//	In instance area, we can call static methods and instance methods directly
	void hello2() {
		System.out.println("method2 called");
		hello3();
		hello4();
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		hello1();
	}

}
