

package com.languagefundamentals.methods;

//2)  No Arguments + With Return Type
public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		System.out.println("Student Information!!!");
		
		TestMethodsDemo4 t1 = new TestMethodsDemo4();
		System.out.println("Student ID:"+ t1.getStudentId());
		System.out.println("Student Name:"+ t1.getStudentName());
		System.out.println("Student Age:"+ t1.getStudentAge());
		System.out.println("Student Rank:"+ t1.getStudentRank());
		System.out.println("Student Height:"+ t1.getStudentHeight());
		System.out.println("Student Weight:"+ t1.getStudentWeight());
		System.out.println("Student Gender:"+ t1.getStudentGender());
		System.out.println("Is Student Passed:"+ t1.isStudentPassed());
	}
	
	byte getStudentId() {
		return 87;
	}
	
	short getStudentAge() {
		short age = 21;
		return age;
	}
	
	int getStudentRank() {
		int rank = 1;
		return rank;
	}
	
	float getStudentHeight() {
		float height = 5.4F;
		return height;
	}
	
	double getStudentWeight() {
		double weight = 52.4;
		return weight;
	}
	
	char getStudentGender() {
		char gender = 'F';
		return gender;
	}
	
	boolean isStudentPassed() {
		boolean status = true;
		return status;
	}

	String getStudentName() {
		String name = "Akshara";
		return name;
	}
}
