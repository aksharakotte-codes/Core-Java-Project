package com.languagefundamentals.constructors;

//Parameterized Constructors

public class Student1ParaCon {
	
	String sid;
	String sname;
	int sage;
	
	
//	No-arg Constructors
	Student1ParaCon() {
		System.out.println("Student No-arg Constructor Called!!");
	}
	
//	Parameterized Constructors
	Student1ParaCon(String sid, String sname,int sage) {
		System.out.println("Student Parameterized Constructor Called!!");
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	
	public static void main(String[] args) {
      System.out.println("Main Method Started");
		
      Student1ParaCon s1 = new Student1ParaCon("JFS-083", "Akshara", 21);//Student Parameterized Constructor Called!!
      s1.show();
		
		
	  Student1ParaCon s2 = new Student1ParaCon("JFS-084", "Vyshu", 22);//Student Parameterized Constructor Called!!
	  s2.show();
		

	  System.out.println("Main Method Ended");

	}
	
	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
	}

}

