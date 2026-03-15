package com.languagefundamentals.constructors.chainingex;
//Parent
public class Employee {
	
	String empName;
	int empId;
	double salary;
	
	Employee() {
		System.out.println("Employee No-arg Consructor called!!");
	}
	Employee(String empName, int empId, double salary) {
		System.out.println("Employee Parameterized Consructor called!!");
		
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("Main Method started from Employee!!");

	}

}
//child class
class Manager extends Employee {
	
	Manager() {
		super();
		System.out.println("Manager No-arg Constructor called!!");
	}
	
	Manager(String empName, int empId, double salary) {
		super(empName, empId, salary);
		System.out.println("Manager Parameterized Consructor called!!");
	}


	public static void main(String[] args) {
		System.out.println("Main Method started from Manager!!");
		
		Manager m1 = new Manager();
		m1.display();
		
		Manager m2 = new Manager("Akshara", 587, 500000.0);
		m2.display();
		
	}
	
	void display() {
		System.out.println("Name of the Employee:" + empName);
		System.out.println("Id of the Employee:" + empId);
		System.out.println("Salary of the Employee:" + salary);
		System.out.println("***************************************");
	}
}