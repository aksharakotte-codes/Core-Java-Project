package com.javaintro;

import javax.management.ObjectName;

public class TestDemo7 {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}

	static TestDemo7 t = new TestDemo7();
	
	static void hello() {
		System.out.println("Hello Method started");
		TestDemo7 t5 = new TestDemo7();
		System.out.println(t5);// Address of the object
//		com.javaintro.TestDemo7@2b2fa4f7
		System.out.println("Hello Method Ended");
	}

	public static void main(String[] args) {
		TestDemo7 t1 = new TestDemo7();
//		System.out.println(t1); //Address of the object
//		com.javaintro.TestDemo4@1dbd16a6
		
		TestDemo7 t2 = new TestDemo7();
//		System.out.println(t2); //Address of the object
//		com.javaintro.TestDemo4@@7ad041f3
		
		
		TestDemo7 t3 = new TestDemo7();
//		System.out.println(t3); //Address of the object
//		com.javaintro.TestDemo4@251a69d7
		
		
//		System.out.println(t);//Address of the object
//		com.javaintro.TestDemo4@7344699f
		
		
//		1)Nullifying the objects
		t1 = null;
		
//		2)Re-assigning the objects
		TestDemo7 t4 = new TestDemo7();
		t4 = t2 ; // Re-assign
		
//		3) Anonymous Objects
		new TestDemo7();
		
//		4)Method inside the objects eligible for garbage
		hello();
		
		
		System.out.println(t1);//null
		
		System.out.println(t2); //Address of the object
//		com.javaintro.TestDemo4@1dbd16a6
		
	
		System.out.println(t3); //Address@7 of the object
//		com.javaintro.TestDemo4@7ad041f3
		
		
		System.out.println(t);//Address of the object
//		com.javaintro.TestDemo4@251a69d7
		
		
		System.out.println(t4);//Address of the object
//		com.javaintro.TestDemo4@7344699f ---> @1dbd16a6
		
		
//		Runs the garbage collector in the Java Virtual Machine.

/*      Calling the gc method suggests that the Java Virtual Machine 
        expend effort toward recycling unused objects in order to make 
        the memory they currently occupy available for reuse by the JVM
 */
		System.gc();

	}

}