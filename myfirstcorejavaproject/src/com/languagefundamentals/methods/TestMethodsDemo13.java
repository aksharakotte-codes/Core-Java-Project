package com.languagefundamentals.methods;

class Employee {
	String name;
}
public class TestMethodsDemo13 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		Employee e1 = new Employee();
		e1.name="Akshara";
		getEmployee(e1);
	}
	static void getEmployee(Employee e1) {
		System.out.println(e1.name);
	}
}
