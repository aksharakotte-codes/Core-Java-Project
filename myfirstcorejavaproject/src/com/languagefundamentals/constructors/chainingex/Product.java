package com.languagefundamentals.constructors.chainingex;
//Parent
public class Product {
	
	String prodname;
	String brand;
    double price;
	
	Product() {
		System.out.println("Product No-arg Constructor called!!");
	}
	Product(String prodname, String brand, double price) {
		System.out.println("Product Parameterized Constructor called!!");
		
		this.prodname = prodname;
		this.brand = brand;
		this.price = price; 
	}

	public static void main(String[] args) {
		System.out.println("Main Method started from Product!!");

	}

}
//child class
class Mobile extends Product {
	
	Mobile() {
		super();
		System.out.println("Mobile No-arg Constructor called!!");
	}
	
	Mobile(String prodname, String brand, double price) {
		super(prodname, brand, price);
		System.out.println("Mobile Parameterized Constructor called!!");
	}


	public static void main(String[] args) {
		System.out.println("Main Method started from Mobile!!");
		
		Mobile m1 = new Mobile();
		m1.showProduct();
		
		Mobile m2 = new Mobile("Mobile Phone", "Samsung", 25000.0);
		m2.showProduct();
		
		System.out.println("Main Method ended from Mobile!!");
	}
	
	void showProduct() {
		System.out.println("Name of the Mobile:" + prodname);
		System.out.println("Brand of the Mobile:" + brand);
		System.out.println("Price of the Mobile:" + price);
		System.out.println("***************************************");
	}
}