package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethodsDemo11 {
	
	static String show(String Name) {
		return Name + " - India";
	}
	
	static int getAge(int age) {
		return age;
	}
	static char getGender(char gender) {
		return gender;
	}
	static int method1() {
		return 'A';
	}
	static char method2() {
		int a = 65;
		return (char) a;
	}
	static String showName(String Name) {
		return Name;
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.next();
		
		System.out.println("Enter your name:");
		sc.nextLine();
		String Name1 = sc.nextLine();
		
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		
		System.out.println("Enter Gender:");
		char gender = sc.next().charAt(0);
				
		System.out.println(show(name));
		System.out.println(showName(Name1));
		System.out.println(getAge(age));
		System.out.println(getGender(gender));
		System.out.println(method1());
		System.out.println(method2());
		
		sc.close();
	}

}
