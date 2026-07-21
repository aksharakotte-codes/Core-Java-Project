package com.java8features;
//Supplier --> T get()
//Don't give anything in input, but it will return something based on your requirements.

import java.util.Date;
import java.util.function.Supplier;

public class PredefinedFunctional04 {

	public static void main(String[] args) {
        System.out.println("Main Method Started");
		
        Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get());
		
		System.out.println("Main Method Ended");

	}

}
