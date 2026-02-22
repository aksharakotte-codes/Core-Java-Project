package com.languagefundamentals;

class Student{
	int id = 101;
	String name = "Akshara";
}

class Address{
	int Flatno = 23;
	String StreetName = "Mancherial";
}

public class TestDataTypesDemo5 {
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Student s = new Student();
		System.out.println(s.id);//0 --> 101
		System.out.println(s.name);// null --> Akshara
		
		
		Address f = new Address();
		System.out.println(f.Flatno);//0 --> 23
		System.out.println(f.StreetName);// null --> Mancherial
		
	}

}
