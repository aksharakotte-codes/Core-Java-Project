package com.multithreading;

class DThread extends Thread {
	@Override
	public void run() {
		System.out.println("Run Method Started");
		for(int i = 0; i < 3; i++) {
			System.out.println("Run : " + i);
		}
		System.out.println("Run Method Ended");
	}
}

public class TestThreadDemo9 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		DThread d = new DThread();
		d.setDaemon(true);
		d.start();
		
		System.out.println(d.isDaemon());
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Main : " + i);
		}
		System.out.println("Main Method Ended!!");
	}

}