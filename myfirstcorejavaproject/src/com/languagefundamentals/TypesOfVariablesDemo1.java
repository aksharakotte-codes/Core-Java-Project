package com.languagefundamentals;

//Static variables:
//Whenever we want to share the same data to all objects then will use "static variables"  for data members


//Instance Variables
//Whenever the data is changing from Object to Object then we will keep the data members as "instance variables"
public class TypesOfVariablesDemo1 {

	//Primitive + instance variable
	int id;
	//ObjectType + instance variable
	String name;

	//Primitive + static variable
	static int collegeId = 55;
	// Based on the value and DataType --> ObjectType + static variable
	static String CollegeName = "Vcube";

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");
		
//		Object Creation to access instance data members
		TypesOfVariablesDemo1  t1 = new TypesOfVariablesDemo1();
		System.out.println(t1.id);//0
		System.out.println(t1.name);//null
		
//		We cannot access instance data through class name
//		Cannot make a static reference to the non-static field TypesOfVariablesDemo1.id
//		System.out.println(TypesOfVariablesDemo1.id); 
		
//		Accessing static data directly...
		System.out.println("**********Accessing static data directly*********");
		System.out.println(collegeId); //55
		System.out.println(CollegeName);//Vcube
		
//		static data members we can access 
//		by using class name also
//	    Sometimes, we need to access the static outside the 
//		class then we must need to access through Class name
//	    Accessing the static data through class name is always recommended
		System.out.println(TypesOfVariablesDemo1.collegeId);
		System.out.println(TypesOfVariablesDemo1.CollegeName); 
		
//		static data members we can access by using Object reference variable also
//		But it gives warning,java program must be error and warning free so we won't use this representation 
//		System.out.println(t1.collegeId);
//		System.out.println(t1.CollegeName);

	}

}
