package com.java8features;

// Lambda Expressions vs Multi-Threading

public class TestJ8Demo6 {

	public static void main(String[] args) {
        System.out.println("Main method Started");
        
        Runnable r = () -> {
    		for(int i = 0; i <= 10; i++) {
    			System.out.println("Run :" + i);
    		}
        };
        
        Thread t = new Thread(r);
        t.start();
        
        Runnable r1 = () -> {
        	for(int i = 0; i <= 10; i++) {
        		System.out.println("Run1 :" + i);
        	}
        };
        
        Thread t1 = new Thread(r1);
        t1.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main :" + i);
		}
		
		System.out.println("Main method Ended");

	}

}
