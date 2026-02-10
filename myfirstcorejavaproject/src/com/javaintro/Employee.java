package com.javaintro;

public class Employee {
	static int orgId=111;
	static String orgName="Vcube";
	
	int EmpId;
	String EmpName;
	public static void main(String[] args) {
		System.out.println("Main Method started!!!");
		
		System.out.println("Employee info 1");
		System.out.println(orgId);
		System.out.println(orgName);
		
		Employee e1 = new Employee();
		e1.EmpId = 587;
		e1.EmpName = "Akshara";
		System.out.println(e1.EmpId);
		System.out.println(e1.EmpName);
		
		System.out.println("Employee info 2");
		orgId = 222;
		orgName = "SIET";
		System.out.println(orgId);
		System.out.println(orgName);
		
		Employee e2 = new Employee();
		e2.EmpId = 569;
		e2.EmpName = "Akhi";
		System.out.println(e2.EmpId);
		System.out.println(e2.EmpName);

		
		
	}

}
