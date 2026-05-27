package com.accessmodifiers01;

//Note : In Java, the default package is javaa.lang and the current package.
//So we no need to import within the same package classes.
class TestAccessModifiers2 {
	
	public static void main(String[] args) {
		System.out.println("Main Method Started from TestAccessModifiers2 class!!");
		
//		Accessing the <default> data members within the class & also outside of the classes. 
		TestAccessModifiers1 t1 = new TestAccessModifiers1();
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2(); 
		
		
		
//		Whenever the data members are private, we cannot access outside of the class
//		We can access only within the class
//		The field TestAccessModifiers1.id1 is not visible
//		System.out.println(t1.id1);
//		The field TestAccessModifiers1.name1 is not visible
//		System.out.println(t1.name1);
//		The method method1() from the type TestAccessModifiers1 is not visible
//		t1.method1();

	}

}




