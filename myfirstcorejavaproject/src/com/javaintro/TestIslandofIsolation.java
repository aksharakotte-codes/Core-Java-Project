package com.javaintro;
class A {
	B b;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called from A!!!");
	}
	
}
class B{
	A a;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called from B!!!");
	}
}

public class TestIslandofIsolation {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.b = obj2;
		obj2.a = obj1;
		
		obj1=null;
		obj2=null;
		
		System.gc();
		System.out.println("Main Method Ended");
	}

}
