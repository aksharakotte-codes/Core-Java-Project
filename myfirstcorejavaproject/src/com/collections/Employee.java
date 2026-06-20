package com.collections;

public class Employee implements Comparable<Employee>{

	int eid;
	String ename;
	long phone;
	int age;
	double salary;

	@Override
	public String toString() {
		return "Employee [eid=" + eid +
				", ename=" + ename +
				", phone=" + phone +
				", age=" + age +
				", salary=" + salary + "]";
	}
	public Employee(int eid, String ename, long phone, int age, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		
//		if(this.eid < o.eid) {
//			return -1;//Ascending order // if you keep +1 the below -1 gives Descending Order
//		} else if(this.eid > o.eid) {
//			return +1;
//		} else {
//			return 0;
//		}
		
 		return -this.ename.compareTo(o.ename); 
 	}

}
