package com.multithreading;
//Synchronizaton
class Resource {
	int i = 0;
	boolean status = false;
	
	synchronized void put(int i) throws InterruptedException {
		
		if(status) {
			wait();
		}
		
		this.i = i;
		System.out.println("PUT : " + i);
		status = true;
		notify();
	}
	synchronized void get() throws InterruptedException {
		
		if(!status) {
			wait();
		}
		
		System.out.println("GET : " + i);
		status = false;
		notify();
	}
}
class Producer implements Runnable {
	Resource r;
	public Producer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 1;
		while(true) {
			try {
				r.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable {
	Resource r;
	public Consumer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
	
		while(true) {
			try {
				r.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class InterThreadCommunication01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Resource r = new Resource();
		
		Producer p1 = new Producer(r);
		Consumer c1 = new Consumer(r);
		
		System.out.println("Main Method Ended");
	}
}
