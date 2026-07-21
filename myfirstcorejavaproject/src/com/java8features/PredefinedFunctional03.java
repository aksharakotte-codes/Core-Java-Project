package com.java8features;
//Consumer<T>  --> void acccept(T)
//It's not returning anything, just printing the statement you are given

import java.util.function.Consumer;

public class PredefinedFunctional03 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Consumer<String> c1 = (s) -> System.out.println(s); 
		c1.accept("Java 8 is more more simple then before !");
		
		System.out.println("Main Method Ended");
	}

}
