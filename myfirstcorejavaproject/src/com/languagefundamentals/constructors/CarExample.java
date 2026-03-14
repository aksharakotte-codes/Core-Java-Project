
package com.languagefundamentals.constructors;

public class CarExample {
	
	String model;
	String brand;
	double price;
	String color;
	
	CarExample(String model,String brand,double price,String color){
		System.out.println("Parameterized Constructor Called!!!");
		this.model = model;
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	
	CarExample(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		CarExample c1 = new CarExample("Sonet","KIA",2500000.00,"Black");
		c1.carInfo();
		
//      It gives CE:Whenever we have only a parameterized constructor in a class,
//		if we want to create an Object without passing any values 
//		then we must need to have no-arg constructor.
		
//		Because Java Complier will not create default constructor,
//		if a class contains any other constructors.
//		CarExample c2 = new CarExample();
//		c2.carInfo();
//		    Followed by this:then gives defaults values to it 
		CarExample c2 = new CarExample();
		c2.carInfo();
	}
	void carInfo() {
		System.out.println("Model of the Car   :"+ model);
		System.out.println("Brand of the Car   :"+brand);
		System.out.println("Price of the Car   :"+price);
		System.out.println("Color of the Car   :"+color);
	}
}
