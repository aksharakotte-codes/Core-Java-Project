package com.stringhandling;

//Creating a String Objects
public class TestStrDemo1 {

	public static void main(String[] args) {
		
//		1. Using String Literals
		String s1 = "Java";//String Literals --> SCP : String Constant Pool
		String s2 = "Java";//0 objects
		String s3 = "Java";//0 objects
		
//		2. Using String Object Literals
		String s4 = new String("Srikanth");//String Object Literal --> Heap Area + SCP --> 2 objects
		String s5 = new String("Srikanth");//String Object Literal --> Heap Area --> 1 Objects
		String s6 ="Srikanth";//String Literals --> 0 Objects
		
//		3. Creating a object using another String Object 
		String s7 = new String(s6);//Heap Area -->1 object
		
//		4. Concatenation Operator
		String s8 = s6 + s3;//SCP --> 1 object --> SrikanthJava
		
//	    5. Re-assigning and Creating a String
		String s9 = s5;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
	}

}
