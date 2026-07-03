package com.stringhandling;

public class Mobile {
	
	String brand;
	String model;
	double price;
	
	@Override
	public String toString() {
		return "Brand :" + brand + ","
				+ " Model :" + model + ","
						+ " Price :" + price;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Mobile m = new Mobile();
		System.out.println(m);
		System.out.println(m.toString());
		
		System.out.println("Main Method Ended!!");
	}

}
