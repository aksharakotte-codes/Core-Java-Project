package com.javaintro;

public class TestDemo4 {
	
	static TestDemo4 t = new TestDemo4();

	public static void main(String[] args) {
		TestDemo4 t1 = new TestDemo4();
		System.out.println(t1); //Address of the object
//		com.javaintro.TestDemo4@2b2fa4f7
		
		TestDemo4 t2 = new TestDemo4();
		System.out.println(t2); //Address of the object
//		com.javaintro.TestDemo4@1dbd16a6
		
		
		TestDemo4 t3 = new TestDemo4();
		System.out.println(t3); //Address of the object
//		com.javaintro.TestDemo4@7ad041f3
		
		
		System.out.println(t);//Address of the object
//		com.javaintro.TestDemo4@251a69d7
		
		

	}

}
