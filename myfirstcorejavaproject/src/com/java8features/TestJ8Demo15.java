package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier; 

//Predefined Functional Interfaces 

//Predicate<T> --> boolean test(T t)
//Function<T, R> --> R apply(T t)
//Consumer<T>  --> void acccept(T)
//Supplier --> T get()
// --------------------------------------------
//Bi-Predicate<T, T> --> boolean test(T t, T t) 
//Function<T, T, R> --> R apply(T t, T t)
//Consumer<T, T>  --> void acccept(T t, T t)

public class TestJ8Demo15 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Predicate<Integer> p1 = (a) -> a > 18;//Returns boolean type
		System.out.println(p1.test(22)); // true
		System.out.println(p1.test(17)); // false
		
		System.out.println("-----------------------------------");
		
		Predicate<String> p2 = (s) -> s.contains("s");//Returns boolean type
		System.out.println(p2.test("Akshara")); // true
		System.out.println(p2.test("Srikanth")); // false
		
		System.out.println("-----------------------------------");
		
		Predicate<Double> p3 = (sal) -> sal > 10000;//Returns boolean type
		System.out.println(p3.test(9000.00)); // false
		System.out.println(p3.test(25000.00)); // true
		
		System.out.println("********************************");
		 
		Function<Integer, Integer> f1 = a -> a * a;//Returns anything that we should write
		System.out.println(f1.apply(10));//100
		
		System.out.println("-----------------------------------");
		
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Java is Simple "));//15
		
		System.out.println("*********************************");
		
		Consumer<String> c1 = (s) -> System.out.println(s); // It's not returning anything, just printing
		c1.accept("Java 8 is more more simple then before !");
		
		System.out.println("*********************************");
		
//		Don't give anything in input, but it will return something based on your requirements.
		Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get());
		
		System.out.println("Main Method Ended !!");
	}

}
