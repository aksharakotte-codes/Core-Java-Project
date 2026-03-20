package com.operators;

// == vs equals methods    
//Comparison Operators : == < <= > >= !=
//All Comparison Operators will give the result of boolean values like true or false.
public class TestComparsionOp1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
//      Whenever we have primitive data types, == operator checks the content
//		If the content is same then return true
		
		int i = 10;
		int j = 10;
		
		System.out.println(i == j);//true

		float f1 = 10.5F;
		double d1 = 10.5;
		
		System.out.println(f1 == d1);//true
		
		char c = 'A';
		char c1 = (char)65;
		System.out.println(c == c1);//true
		
		System.out.println("***********************************");
		
//	    String Literals are storing into SCP (String Constant Pool)	
//      Whenever we are working with object Data types, == Operators 
//		are not checks the content, but it checks the addresses of the Object	
		String s1 = "Java";// The value present in "" and they are stored in String Called String Literals
		String s2 = "Java";
		System.out.println(s1 == s2);//true
		
//		String Object with new keyword(checks the addresses of the Object)
		String s3 = new String("Akshara");
		String s4 = new String("Akshara");
		System.out.println( s3 == s4);//false
		
//		Whenever we have object data types, if you want 
//		to compare the content not address 
		
		System.out.println(s3.equals(s4));//true
		
//		Equals Ignore Case : used to compare two strings ignoring case differences (Upper case/Lower case)
		String s5 = new String("AKSHARA");
		String s6 = new String("akshara");
		System.out.println( s5.equalsIgnoreCase(s6));//true
		System.out.println("***************************************");
		
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);//true
		
//		It follows the Cache Method within range (-128 to 127)
//		If it is more than 127, it is going to give you false
		
		Integer i3 = 200;
		Integer i4 = 200;
		System.out.println(i3 == i4);//false
		System.out.println(i3.equals(i4));//true
	}

}
