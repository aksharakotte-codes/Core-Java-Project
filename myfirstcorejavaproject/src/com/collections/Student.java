package com.collections;

public class Student {
	
//	Private variables
	private int sid;
	private String sname;
	private int age;
	private long phone;
	
//	toString Method
	@Override
	public String toString() {
		return "Student [sid=" + sid +
				", sname=" + sname +
				", age=" + age +
				", phone=" + phone + "]";
	}
//    All Arg Constructor
	public Student(int sid, String sname, int age, long phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.phone = phone;
	}

	
	public int getSid() {
		return sid;
	}
	
//	No Arg Constructor
	public Student() {
		
	}
	
//	Setter and Getter methods
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}

	
}
