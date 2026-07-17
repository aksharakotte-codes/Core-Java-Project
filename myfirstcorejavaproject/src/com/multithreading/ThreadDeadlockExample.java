package com.multithreading;

public class ThreadDeadlockExample {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		final String resource1 = "Akshara";
		final String resource2 = "Akhi";
		
//		t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 : Locked Resource 1");
					
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
					
					synchronized (resource2) {
						System.out.println("Thread 1 : Locked Resource 2");
					}	
				}
			}	
		};
		
//		t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 : Locked Resource 2");
					
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
					
					synchronized (resource1) {
						System.out.println("Thread 2 : Locked Resource 1");
					}	
				}
			}	
		};
		
		t1.start();
		t2.start();
		System.out.println("Main Method Ended!!");
	}

}
