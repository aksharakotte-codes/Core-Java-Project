package com.java8features;
//Predefined Functional Interfaces 

import java.util.function.Function;

//Function<T, R> --> R apply(T t)
//Input as datatype in first column, and give what kind of output you need as either Integer, String.. so on

public class PredefinedFunctional02 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Function<Integer, Integer> f1 = a -> a * a;//Returns anything that we should write in second column
		System.out.println(f1.apply(10));//100
		
		System.out.println("-----------------------------------");
		
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Java is Simple "));//15
		
		System.out.println("Main Method Ended !!");
	}

}
