package com.multithreading;

//Executor Service
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " +"is executing task");
	}
	
}

public class ExecutorDemo {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i = 1; i <= 10; i++) {
			service.execute(new MyTask());
		}
		
		service.shutdown();
		
		System.out.println("Main Method Ended!!");
	}

}
