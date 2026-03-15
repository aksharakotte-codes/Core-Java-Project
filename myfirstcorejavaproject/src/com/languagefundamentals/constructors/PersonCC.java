package com.languagefundamentals.constructors;

//TestConChainingDemo3
//Super or Parent class
public class PersonCC {
	
	String name;
	int age;
	long phn_no;
	
	public PersonCC() {
		System.out.println("Person No-arg Constructor Called");
	}
	
	PersonCC(String name,int age, long phn_no) {
		System.out.println("Person 3-argumented Constructor Called");
		
		this.name = name;
		this.age = age;
		this.phn_no = phn_no; 
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started from Person!!");
	}

}

//Sub or Child class 
class Customer extends PersonCC {
	
	public Customer() {
		System.out.println("Customer No-arg Constructor Called");
	}
	
	Customer(String name,int age, long phn_no) {
		super(name,age,phn_no);
		System.out.println("Customer 3-argumented Constructor Called");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started from Customer!!");
		
		Customer c1 = new Customer();
		c1.show();
		
		Customer c2 = new Customer("Akhi", 21, 2334566789L);
        c2.show();
		
		System.out.println("Main Method Ended from Customer!!");
		
	}
	
	void show() {
		System.out.println("******************Customer Info******************");
		System.out.println("Name of the Customer: " + name);
		System.out.println("Age of the Customer: " + age);
		System.out.println("Phone No of the Customer: " + phn_no);
		System.out.println("************************************");
	}
	
}
