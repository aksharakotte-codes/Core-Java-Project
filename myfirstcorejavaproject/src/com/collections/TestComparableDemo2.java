package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparableDemo2 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(7,"Dhoni", 9182991299L, 43, 200000);
		Employee emp2 = new Employee(18,"Kohil", 9482991399L, 38, 730000);
		Employee emp3 = new Employee(45,"Rohit", 9982881299L, 41, 300000);
		Employee emp4 = new Employee(1,"KL Rahul", 9982391299L, 35, 232000);
		Employee emp5 = new Employee(8,"Jadeja", 9982992289L, 37, 500000);
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Collections.sort(empList);
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
