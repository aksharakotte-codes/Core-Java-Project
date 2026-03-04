package com.languagefundamentals.constructors;

public class CricketerNoArgCon {
	
	int jno;
	String name;
	
//	no-arg Constructor
	CricketerNoArgCon() {
		System.out.println("No-Arg Constructor called!!");
	}
	{
		System.out.println("Instance Block Called !!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		The below Object is created with the help of no-arg constructor.
//		Whenever the class contains any constructor then Java Complier will not create 
//		default constructor, now we have explicit no-arg constructor .
//		So the  below Object is created 
//		CricketerNoArgCon() ---> Constructor calling
        CricketerNoArgCon c1 = new CricketerNoArgCon(); 
		c1.jno = 18;
		c1.name = "Virat Kohil";
		System.out.println(c1.jno);
		System.out.println(c1.name);
		
		System.out.println("Main Method Ended !!!"); 
	
	}

}
