package com.multithreading;

// By implementing the Runnable interface (2 ways)
// 1.When an Object (Thread) implementing interface Runnable is used to Create a Thread
// 2. Starting the thread causes the object's(Thread) run method to be called in that separately executing thread. 

 public class TestThreadDemo2 extends Thread implements Runnable {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		System.out.println(Thread.currentThread());
		
		TestThreadDemo2 r = new TestThreadDemo2();//Runnable Object
		Thread t = new Thread(r);
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