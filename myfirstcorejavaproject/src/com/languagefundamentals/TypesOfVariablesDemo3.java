package com.languagefundamentals;

public class TypesOfVariablesDemo3 {

	
	int id = 10;
	
//	static variable
	static String CollegeName = "VSS";
	public static void main(String[] args) {
		System.out.println(CollegeName);//VSS
		TypesOfVariablesDemo3 t1= new TypesOfVariablesDemo3();
		System.out.println(t1.id);//9
		
		//Local Variable
//		Why local variables..?
//		To maintain temporary data.
		String CollegeName = "SSS";
		
//		Note : If we use static :Illegal modifier for parameter id; only final is permitted
		//static int id = 9;
//		For all local variables we can only use one modifier which is "final",
//		we cannot use any other modifier like static
		int id = 9;
		
		//for Local variables,JVM doesn't provide default values
//		Whenever we access local variables , 
//		the variable must be assigned otherwise we will CE
		int x;
//		System.out.println(x);//The local variable x may not have been initialized
		x= 100;
		System.out.println(x);
		
		
		System.out.println("Main method started");
		
		//Accessing local variable 
		System.out.println(CollegeName);//SSS
		System.out.println(id);//9
		
		TypesOfVariablesDemo3.CollegeName = "ANSS";
		//Accessing static data with class name must recommended every time
		System.out.println("College name:"+TypesOfVariablesDemo3.CollegeName);//VSS 

	}

}
