package com.languagefundamentals.constructors;

public class StudentNoArgCon {
	
	String sid;
	String sname;
	int sage;
	
	StudentNoArgCon() {
		System.out.println("Student No-arg Constructor Called!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		StudentNoArgCon s1 = new StudentNoArgCon();//Student No-arg Constructor Called!!
		s1.sid = "JFS-083";
		s1.sname = "Akshara";
		s1.sage = 21;
		System.out.println(s1.sid);//null --> JFS-083
		System.out.println(s1.sname);//null ---> Akshara
		System.out.println(s1.sage);//0 --->21
		
		StudentNoArgCon s2 = new StudentNoArgCon();//Student No-arg Constructor Called!!
		s2.sid = "JFS-084";
		s2.sname = "Vyshu";
		s2.sage = 22;
		System.out.println(s2.sid);//null --> JFS-084
		System.out.println(s2.sname);//null ---> Vyshu
		System.out.println(s2.sage);//0 --->22

		System.out.println("Main Method Ended");
	}

}
