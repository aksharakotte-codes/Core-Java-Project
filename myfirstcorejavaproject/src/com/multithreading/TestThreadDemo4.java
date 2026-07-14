package com.multithreading;

 public class TestThreadDemo4 extends Thread {
	 
//	 @Override
//	 public void start() {
//		 System.out.println("Hello start");
//	 }

	public static void main(String[] args) {
		
		System.out.println("Main Method Started!!");
		System.out.println(Thread.currentThread());
		
		TestThreadDemo4 t = new TestThreadDemo4();
		t.start();
//		t.start();
		t.run(10);
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Main : " + i);
		}
		
		System.out.println("Main Method Ended!!");
	}
	
	void run(int i) {
		System.out.println("Run Called!");
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
