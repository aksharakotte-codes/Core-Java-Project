package com.languagefundamentals.constructors;

//Parameterized Constructors
public class StudentParameterizedCon {
	String sid;
	String sname;
	int sage;
	//No-arg Constructors
	StudentParameterizedCon() {
		System.out.println("Student No-arg Constructor Called!!");
	}
	
//	Parameterized Constructors
	StudentParameterizedCon(String sid, String sname,int sage) {
		
	}
	
	public static void main(String[] args) {
        System.out.println("Main Method Started");
		
        StudentParameterizedCon s1 = new StudentParameterizedCon("JFS-083", "Akshara", 21);//Student No-arg Constructor Called!!
		s1.show();
		
		
		StudentParameterizedCon s2 = new StudentParameterizedCon("JFS-084", "Vyshu", 22);//Student No-arg Constructor Called!!
		s2.show();
		

		System.out.println("Main Method Ended");

	}
	
	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
	}

}
