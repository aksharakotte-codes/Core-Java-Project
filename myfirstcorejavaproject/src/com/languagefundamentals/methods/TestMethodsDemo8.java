package com.languagefundamentals.methods;

import  java.util.Scanner;
public class TestMethodsDemo8 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		
//		Byte
		System.out.println("Enter Student Id:");
		byte Id = sc.nextByte();
		
//		String
		System.out.println("Enter your first name:");
		String FName = sc.next();
		System.out.println("Enter your Last name:");
		String LName = sc.next();
		
//		Int
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		
//		Short
		System.out.println("Enter your Rank:");
		short Rank = sc.nextShort(); 
		
//		Long
		System.out.println("Enter your PersonalId:");
		long PersonalId = sc.nextLong();
		
//		 Float
		System.out.println("Enter your Height:");
		float Height= sc.nextFloat();
		
//		Double
		System.out.println("Enter your Weight:");
		double Weight= sc.nextDouble();
		
//		Character
		System.out.println("Enter your Gender:");
		char gender = sc.next().charAt(0);
		
//		Boolean
		System.out.println("Are you Passed:");
		boolean passed = sc.nextBoolean();
		
		
		TestMethodsDemo8 t = new TestMethodsDemo8();
		t.getStudentId(Id);
		t.getStudentName(FName, LName);
		t.getStudentAge(age);
		t.getStudentRank(Rank);
		t.getStudentPersonalId(PersonalId);
		t.getStudentHeight(Height);
		t.getStudentWeight(Weight);
		t.getStudentGender(gender);
		t.isStudentPassed(passed);
		
		
		sc.close();
	}
    void getStudentId(byte id) {
    	System.out.println("Enter Student Id:" + id);
    }
    
    void getStudentName(String first,String last) {
    	System.out.println("Enter Student Full Name:" + first + " " + last);
    }
    
    void getStudentAge(int age) {
    	System.out.println("Enter Student Age:" + age);
    }
    
    void getStudentRank(short rank) {
    	System.out.println("Enter Student Age:" + rank);
    }
    
    void getStudentPersonalId(long PersonalId) {
    	System.out.println("Enter Student PersonalId:" + PersonalId);
    }
    
    void getStudentHeight(float height) {
    	System.out.println("Enter Student Height:" + height);
    }
    
    void getStudentWeight(double weight) {
    	System.out.println("Enter Student Weight:" + weight);
    }
    
    void getStudentGender(char gender) {
    	System.out.println("Enter Student Gender:" + gender);
    }
    
    void isStudentPassed(boolean passed) {
    	System.out.println("Enter Student Pasesed .:" + passed);
    }
}
