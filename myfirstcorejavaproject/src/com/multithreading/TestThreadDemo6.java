package com.multithreading;

//By using yield() method, it is used to help that prints last in output

class Case {
	//1000 methods
}

class Video extends Case implements Runnable {
		@Override
		public void run() {
			System.out.println("Video Started");
			System.out.println(Thread.currentThread());
			for(int i = 0; i <= 10; i++) {
				System.out.println("Video Thread : ");
			}
			System.out.println("Video Ended");
		}
}
class Audio extends Thread {
	@Override
	public void run() { 
		System.out.println("Audio Started");
		System.out.println(Thread.currentThread());
		for(int i = 0; i <= 10; i++) {
			System.out.println("Audio Thread : ");
		}
		System.out.println("Audio Ended");    
		
	}
	
}

class Timer extends Thread {
	@Override
	public void run() {
		System.out.println("Timer Started");
		System.out.println(Thread.currentThread());
		Thread.yield();
		for(int i = 0; i <= 10; i++) {
			System.out.println("Timer Thread : ");
		}
		System.out.println("Timer Ended");	
	}
}
public class TestThreadDemo6 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println(Thread.currentThread());
		
		Video v1 = new Video();
		Thread t = new Thread(v1);
		t.start();
		
		Audio a1 = new Audio();
		a1.start();
		
		Timer t1 = new Timer();
		t1.start();
		
		System.out.println("Main Method Ended");
	}

}
