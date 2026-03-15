package com.languagefundamentals.constructors;

class  Animal {
	String name = "Puppy";
	void show() {
		System.out.println("Animal : " + name);
	}
}
class Dog extends Animal {
	
	String name = "Sweety";
	
	//Note : This super can use only in instance area but not in static area
	@Override
	void show() {
		System.out.println("Dog : " + super.name);
	}
	
	void sho() {
		System.out.println("Dog : " + this.name);
	}
	
//	Cannot use super in a static context
//	Cannot use this in a static context
//	static void display() {
//		System.out.println("Dog : " + super.name);
//	}
}
public class TestConChDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Dog d = new Dog();
		d.show();
		d.sho();
		
		System.out.println("Main Method Ended");
	}

} 