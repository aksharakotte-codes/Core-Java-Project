package com.multithreading;

class SThread extends Thread {
	@Override
	public void run() {
		System.out.println("Run Method Started");
		for(int i = 0; i <= 10; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("Run : " + i);
		}
		System.out.println("Run Method Ended");
	}
}

public class TestThreadDemo8 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		SThread s = new SThread();
		s.start();
		s.interrupt();
		
		for(int i = 11; i <= 20; i++) {
			System.out.println("Main : " + i);
		}
		System.out.println("Main Method Ended!!");
	}

}
