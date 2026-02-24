package com.languagefundamentals;

public class TypesOfVariablesDemo4 {
	
	int id ;
	static String name = "Akshara";
	
	public static void main(String[] args) {
		
		var a = 100;
		var a1 = "Akhi";
		var a2 = 5.9;
		var a3 = 'A';
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		TypesOfVariablesDemo4 t = new TypesOfVariablesDemo4();
		t.id = 101;
		System.out.println(t.id);//0 --> 101
		System.out.println(TypesOfVariablesDemo4.name);//Akshara
//		System.out.println(t.name);//Akshara
		
		
		TypesOfVariablesDemo4 t2 = new TypesOfVariablesDemo4();
		System.out.println(t2.id);//0
		System.out.println(TypesOfVariablesDemo4.name);//Akshara
//		System.out.println(t2.name);//Akshara
		
		TypesOfVariablesDemo4 t3 = null; // null. anything is NPE(NullPointerException)
    	System.out.println(t3.name);//but not for static data gives previous name //Akshara
//		System.out.println(t3.id); //NPE
		
	}

}
