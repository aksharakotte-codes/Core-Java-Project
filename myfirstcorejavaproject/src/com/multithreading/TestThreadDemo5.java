package com.multithreading;

public class TestThreadDemo5 extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main Method Started!!");
		System.out.println(Thread.currentThread());
		System.out.println("Name :" +Thread.currentThread().getName());
		
		
		TestThreadDemo5 t = new TestThreadDemo5();
		t.start();
		
		for(int i = 0; i <= 15; i++) {
			System.out.println("Main");
		}
		
		System.out.println("Main Method Ended!!");
	}
	
	@Override
	public void run() {
		System.out.println("Run Method Started");
		
//		TestThreadDemo5 t5 = new TestThreadDemo5();
//		t5.setName("Spring Boot");//Thread - 0
		
		Thread.currentThread().setName("Java");// Java
		System.out.println("Name :" +Thread.currentThread().getName());//Thread - 0
		Thread.currentThread().setPriority(50);// IllegalArgumentException
		Thread.currentThread().setPriority(MAX_PRIORITY);
		
		System.out.println("Priority :" + Thread.currentThread().getPriority());
		for(int i = 0; i <= 25; i++) {
			System.out.println("Run ");
		}
		
		System.out.println("Run Method Ended!!");
	}
	
}
