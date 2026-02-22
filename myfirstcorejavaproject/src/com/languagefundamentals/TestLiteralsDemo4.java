package com.languagefundamentals;

//String Literals
public class TestLiteralsDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		Collection of Characters storing into a double quotes will consider as String
		String s1 = "Akshara"; //String Literals --> SCP : String Constant Pool
		String s2 = "Akshara";
		String s3 = new String("Akshara"); // stores in Heap area directly
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//If you want to know where it stores,
//		where s1, s2 stores in same memory location in heap memory bcz its true
//		and s3 directly stores in heap memory bcz its false 
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		
		//If you want to compare the content
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		
	}
}	