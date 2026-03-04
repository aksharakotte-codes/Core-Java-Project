package com.languagefundamentals.constructors;

//Default Constructor
//Note : In Java, If the program doesn't contain any explicit constructor 
//then Java Complier will create a constructor name called  Default Constructor

//Example : It looks like below :
//Synatx : public CricketerDefaultCon(){ } (which we cannot see)
public class CricketerDefaultCon {
	
	int jno;
	String name;
	
	public static void main(String[] args) {
		System.out.println("Main Method Started !!!");
		
//		The below Object is created with the help of default constructor.
//		Whenever does not contain any other constructor the 
//		Java Complier will create default constructor. 
		CricketerDefaultCon c1 = new CricketerDefaultCon(); 
		
		System.out.println(c1.jno);
		System.out.println(c1.name);
		
		System.out.println("Main Method Ended !!!");
	}

}
