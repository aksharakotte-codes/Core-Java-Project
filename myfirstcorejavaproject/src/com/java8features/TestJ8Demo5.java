package com.java8features;
// Lambda Expressions with conciseing the functional programming.
public class TestJ8Demo5 {

	public static void main(String[] args) {
        System.out.println("Main method Started");
        
        Runnable r = () -> {
    		for(int i = 0; i <= 10; i++) {
    			System.out.println("Run :" + i);
    		}
        };
        
        Thread t = new Thread(r);
        t.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main :" + i);
		}
		
		System.out.println("Main method Ended");

	}

}
