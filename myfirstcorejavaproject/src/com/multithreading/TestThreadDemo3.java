package com.multithreading;

//Which one is better either extends Thread or Implements Runnable ..?
//implements Runnable is the best option 
//if we use extends test below, 
//run() method cannot override because we again use implements Runnable .

class Test {
	//1000 methods
}

class VideoThread extends Test implements Runnable {
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
class AudioThread extends Thread {
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

class TimerThread extends Thread {
	@Override
	public void run() {
		System.out.println("Timer Started");
		System.out.println(Thread.currentThread());
		for(int i = 0; i <= 10; i++) {
			System.out.println("Timer Thread : ");
		}
		System.out.println("Timer Ended");	
	}
}
public class TestThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println(Thread.currentThread());
		
		VideoThread v1 = new VideoThread();
		Thread t = new Thread(v1);
		t.start();
		
		AudioThread a1 = new AudioThread();
		a1.start();
		
		TimerThread t1 = new TimerThread();
		t1.start();
//		t1.start(); // IllegalThreadStateException --> UnChecked Exception
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("main ");
		}
		
		System.out.println("Main Method Ended");
	}

}
