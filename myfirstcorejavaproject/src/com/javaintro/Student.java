package com.javaintro;

public class Student {
	
	
	//Decalaration
			// Static Variables:These are used when a value is common to all objects
			static int collegeId = 333;
			static String collegeName = "Vcube";
			
			
			
			// Instance Variables:Each object gets its own separate copy of instance variables.
			int sId = 565;
			String sName = "Vyshuu";
			
			
	public static void main(String[] args) {
			System.out.println("Main method started!!!");
			System.out.println("College related Information");
			System.out.println("Object1 Info*****************");
			
			//Representing or accessing the static data
		    System.out.println("College Id:"+ collegeId);// 0 -->  333 
		    System.out.println("College Name:"+collegeName);// null --> Vcube
		    
//		    Initializing & Accessing the instance data
//	      Note:We cannot access instance data in static area directly.
//	      If we want to access the instance data in static area,we must need to create object
		    
		    
		    
		    //Object creation in Java with a class and with new keyword
		    Student s1 = new Student();
//	      Student --> Class Name
//	      s1 -->Object Reference variable
//	      new Student() -->  It creates a new object in heap memory
//        Student() --> Constructor calling		    
		    s1.sId = 587;
		    s1.sName = "Akshara";
		    
		    
		   // Accessing the instance data
		    System.out.println("Student Id:"+s1.sId);// 0 --> 587
		    System.out.println("Student Name:"+s1.sName);// null-->"Akshara"
		    
		    
		    //Object 2 Information
		    //Initializing the static data
		    collegeId = 1 ;
			collegeName = "Siddhartha Institute of Engineering and Technology";
		    
		    System.out.println("Object2 Info*********************");
		    System.out.println("College Id:"+collegeId);//1
		    System.out.println("College Name:"+collegeName);//Siddhartha Institute of Engineering and Technology
		    Student s2 = new Student();
		    s2.sId = 588;
		    	s2.sName = "Vyshnavi";
		    System.out.println("Student Id:"+s2.sId);//588
		    System.out.println("Student Name:"+s2.sName);//Vyshnavi
		    
		    
		    //Object 3 Information
		    //Changing the static data
		    //If once the static data changes,then next coming objects follows the same previous objects static data
		    System.out.println("Object3 Info**********************");
		    collegeId = 222 ;
			collegeName = "SIET";
		    System.out.println("College Id:"+collegeId);//222
		    System.out.println("College Name:"+collegeName);//SIET
		    Student s3 = new Student();
		    s3.sId = 517;
		    	s3.sName = "Sri Harshini";
		    System.out.println("Student Id:"+s3.sId);//517
		    System.out.println("Student Name:"+s3.sName);// Sri Harshini
		    
		    
		    //Object 4 Information
		    
		    System.out.println("Object4 Info***********************");
		    	System.out.println("College Id:"+collegeId);//222
		    System.out.println("College Name:"+collegeName);//SIET
		    Student s4 = new Student();
		    s4.sId = 577;
		    	s4.sName = "Ammu";
		    System.out.println("Student Id:"+s4.sId);//577
		    System.out.println("Student Name:"+s4.sName);//Ammu
		    
		    
		    
		    //Object 5 Information
		    System.out.println("Object2 Info*********************");
		    System.out.println("College Id:"+collegeId);//222
		    System.out.println("College Name:"+collegeName);//SIET
		    Student s5 = new Student();
		    System.out.println("Student Id:"+s5.sId);//565(The value came from the class we mentioned as instance variable)
		    System.out.println("Student Name:"+s5.sName);//Vyshuu


		    
		    
			System.out.println("Main method ended!!!");	

	}

}
