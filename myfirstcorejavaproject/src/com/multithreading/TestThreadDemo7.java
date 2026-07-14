package com.multithreading;
// join()

class JThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("J1 Started");
		for(int i = 0; i <= 50; i++) {
			System.out.println("J1 : " + i);
		}
		System.out.println("J1 Ended");
	}
}

class JThread2 extends Thread {
	
	JThread3 j3;
	
	JThread2(JThread3 j3) {
		this.j3 = j3;
	}
	@Override
	public void run() {
		System.out.println("J2 Started");
		for(int i = 50; i <= 100; i++) {
			if(i == 75) {
				try {
					j3.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("J2 : " + i);
		}
		System.out.println("J2 Ended");
	}
}

class JThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("J3 Started");
		for(int i = 100; i <= 150; i++) {
			System.out.println("J3 : " + i);
		}
		System.out.println("J3 Ended");
	}
}
public class TestThreadDemo7 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		JThread1 j1 = new JThread1();
		
		JThread3 j3 = new JThread3();
		
		JThread2 j2 = new JThread2(j3);
		
		j1.start();
		j2.start();
		j3.start();
		
		System.out.println("Main Method Ended");
	}

}
