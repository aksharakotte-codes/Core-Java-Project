package com.languagefundamentals.constructors;
//TestConChainingDemo4
//Parent class
public class VehicleCC {
	
	String brand;
	String model;

	VehicleCC() {
		System.out.println("Vehicle No-arg Constructor Called!!");
	}
	
	public VehicleCC(String brand, String model) {
		super();
		System.out.println("Vehicle Parameterized Constructor Called!!");
		this.brand = brand;
		this.model = model;
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started from Vehicle!!");

	}	
}	
//Child class or Sub class
//	Implicit super constructor VehicleCC() is undefined for default constructor.
//	Must define an explicit constructor
	
//Whenever we extends parent class & that parent class contains only Parameterized Constructor
//then child class default constructor always called the parent class default or no-arg 
//So if we have any parameterized constructor we must need to maintain no-arg constructor 
	
class Bike extends VehicleCC { 

	public static void main(String[] args) {
		System.out.println("Main Method Started from Bike!!");
		
		Bike b = new Bike();
		
		System.out.println("Main Method Ended from Bike!!");
		
		

	}
}
