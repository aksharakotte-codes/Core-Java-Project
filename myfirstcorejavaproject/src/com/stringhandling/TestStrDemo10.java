package com.stringhandling;

public class TestStrDemo10 {

	public static void main(String[] args) {  
		System.out.println("Main Method Started!!");
		
		char[] ch = {'J', 'a', 'v', 'a'}; 
		String s1 = String.copyValueOf(ch);
		System.out.println(s1);//Java
		
		char[] ch1 = {'J', 'a', 'v', 'a', ' ', 'i', 's', 's', 'i', 'm', 'p', 'l', 'e'};
		String s2 = String.copyValueOf(ch1, 7, 6);//from 7 value to 6 charcaters
		System.out.println(s2);
		
		System.out.println("-------------------------");
		String[] names = {"J2SE", "J2EE", "Spring", "Spring Boot", "Microservices", "jdbc", "J2Me"};
		
		for(String name : names) {
			
			if(name.toLowerCase().startsWith("j") && name.toUpperCase().endsWith("E")) {
				System.out.println(name);
			}
		}
		System.out.println("Main Method Ended!!");
	}

} 

;

