package com.stringhandling;

public class TestStrDemo5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Runtime rt = Runtime.getRuntime();
		
		@SuppressWarnings("unused")
		int[] arr = new int[200000000];
		
		System.out.println("Initial Heap : " + rt.totalMemory() / (1024 * 1024) + "MB");
		System.out.println("Maximum Heap : " + rt.maxMemory() / (1024 * 1024) + "MB");
		System.out.println("Free Heap : " + rt.freeMemory() / (1024 * 1024) + "MB");
		
		System.out.println("Main Method Ended");
	}

}
