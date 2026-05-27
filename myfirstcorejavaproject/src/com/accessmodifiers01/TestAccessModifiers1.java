package com.accessmodifiers01;

//Illegal modifier for the class TestAccessModifiers1;
//only public,<default>,strictfp, abstract & final are permitted for class
//private class TestAccessModifiers1 {

//The block Scope is : class scope
//If your class is default, block scope is also default
//If your class is public, block scope is also public

public class TestAccessModifiers1 {
	
	static {
		System.out.println("Static block called from Test1");
	}
	{
		System.out.println("Instance block called from Test1");
	}
	
//	protected data members
	protected int id4 = 1;
	protected String name4 = "Rahul";
	
	protected void method4() {
		System.out.println("Method4 called");
	}
	
	
//	public data members
	public int id3 = 45;
	public String name3 = "Rohit";
		
	public void method3() {
			System.out.println("Method3 Called");
		}
		
//	default data members
		int id2 = 18;
		String name2 = "Kohli";
		
		void method2() {
			System.out.println("Method2 Called");
		}
		
//	private data members
	private  int id1 = 7;
	private String name1 = "MSD";
	
	//Constructor
	public TestAccessModifiers1() {
		System.out.println("Hello!! No arg Constructor");
	}
	private void method1() {
		System.out.println("Method1 Called!!");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started from TestAccessModifiers1 class!!");
		
//		Accessing the private data members within the class
		TestAccessModifiers1 t1 = new TestAccessModifiers1();
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();
		
//		Accessing the default data members within the package
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();
		
//		Accessing the public data members outside of the packages and within the project
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();
		
		
		
//		Accessing the protected data members outside of the packages not possible directly.
//		System.out.println(t1.id4);
//		System.out.println(t1.name4);
//		t1.method4();

	}
	
	//A class inside the class is Inner class to work with Temporary requirements.
	
	private class TestIn1 {
		
	}

}
