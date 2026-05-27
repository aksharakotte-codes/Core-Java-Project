package com.accessmodifiers02;

import  com.accessmodifiers01.TestAccessModifiers1;

//TestAccessModifiers1 --> Super Class
//TestAccessModifiers3 --> Sub Class
public class TestAccessModifiers3 extends TestAccessModifiers1{
	
//	The protected data we can access within the class, package and outside 
//	of the packages of sub classes + with sub class object reference only but not
//	with the super class object reference.

	public static void main(String[] args) {
		System.out.println("Main Method Started from TestAccessModifiers3 class!!");

		TestAccessModifiers1 t1 = new TestAccessModifiers1();
//		Accessing the public data members outside of the packages
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

		TestAccessModifiers3 t3 = new TestAccessModifiers3();
		System.out.println(t3.id4);
		System.out.println(t3.name4);
		t3.method4();
//		Even though TestAccessModifiers1 is public, Whatever the data we are accessing is default,
//		so default data we cannot access outside of the packages
//		System.out.println(t1.id2);
//		System.out.println(t1.name2); 
//		t1.method2();                   
	}

}
