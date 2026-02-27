package com.languagefundamentals.methods;

//2)  No Arguments + With Return Type
public class TestMethodsDemo3 {
	
	
	//Static block
	static {
		System.out.println("Static block");
	}
	
	//Instance block
	void main(String[] args) {
		  System.out.println("Main method started!!");
		  System.out.println("The Employee Age is :" + getEmployeeAge());
//		  System.out.println("The Employee total salary is :" + (getEmployeeSalary() + getEmployeeBonus()));
		  
		  double sal = getEmployeeSalary();
		  double bon = getEmployeeBonus();
//		  System.out.println("The Employee total salary is :" + sal + bon);//500000.020000.0
		  System.out.println("The Employee total salary is :" + (sal + bon));//BODMAS //520000.0
		  
	}
    int getEmployeeAge() {
    	int age = 22;
    	return age;
    }
    
    double getEmployeeSalary() {
    	int salary = 500000;
    	return salary;
    }
    
    double getEmployeeBonus() {
    	int bonus = 20000;
    	return bonus;
    }
}
