package com.java8features;
//String

@FunctionalInterface
interface In9 {
	 void hello(String s);
}

public class TestJ8Demo10 {

	public static void main(String[] args) {
        System.out.println("Main Method Started");
		
		In9 i = (s) -> System.out.println(s.length());
		i.hello("Java is simple");// 14
        
      
		System.out.println("Main Method Ended");

	}

}
