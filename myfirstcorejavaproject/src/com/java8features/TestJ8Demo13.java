package com.java8features;
//Anonymous Inner Class vs Lambda Expression

//Lambda Expression are not replaced for Anonymous Inner Class.
//Anonymous Inner Class is more poerful than Lambda Expression.
//Anonymous Inner Class != Lambda Expression


interface In11 {
	void hello();
}

class Test1 {
	void method1() {
		System.out.println("Method1 called from Test1");
	}
}

public class TestJ8Demo13 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		Anonymous Inner Class extends Test1
		Test1 t1 = new Test1() {
			@Override
			void method1() {
				System.out.println("Method1 called from Anonymous");
			}
		};
		
//		Anonymous Inner Class Implements In1 
		In11 i = new In11() {
			@Override
			public void hello() {
				System.out.println("Hello Good Afternoon");
			}
		};
		i.hello();
		
		System.out.println("Main Method Ended");
	}
}
