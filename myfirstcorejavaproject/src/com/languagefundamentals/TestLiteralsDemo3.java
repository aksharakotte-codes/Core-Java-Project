package com.languagefundamentals;

//Char Literals
public class TestLiteralsDemo3 {

	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		//Character can store 0 to 65535
		char c1 ='A';//  Single Quote Characters 
		char c2 = 68;//ASCII value
		char c3 = '\u0040';// unicode Characters
		char c4 = 126;//unicode Characters
		char c5 = 1234;//Junk characters we cannot use it (it looks like A but its not A)
		
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		 System.out.println(c4);
		 System.out.println(c5);
		 
		 char c6 = '\n';   // New line
		 char c7 = '\t';       // Tab space
		 char c8 = '\'';     // Single quote
		 char c9 = '\\'; // Backslash
		 
		 System.out.println(c6);
		 System.out.println(c7);
		 System.out.println(c8);
		 System.out.println(c9);

	}

}
