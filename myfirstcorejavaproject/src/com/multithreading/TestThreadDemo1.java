package com.multithreading;

// By extending the Thread class (3 ways)
// 1.Extends Thread
// 2.overriding run() method
// 3.Call start() method
 public class TestThreadDemo1 extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started!!");
		System.out.println(Thread.currentThread());
		
		TestThreadDemo1 t = new TestThreadDemo1();
		t.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main : " + i);
		}
		
		System.out.println("Main Method Ended!!");
	}
	
	@Override
	public void run() {
        System.out.println("Run Method Started!!");
        System.out.println(Thread.currentThread());
		for(int i = 0; i <= 10; i++) {
			System.out.println("Run : " + i);
		}
		System.out.println("Run Method Ended!!");
	}

	
}
