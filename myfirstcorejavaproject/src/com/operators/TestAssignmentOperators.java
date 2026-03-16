package com.operators;

//AssignmentOperators or Compound Operators --> == += -= /= %= 
public class TestAssignmentOperators {

	public static void main(String[] args) {
		
		int result = 0;
		double a = 5.5;
//		result = result + a;//Type mismatch: cannot convert from double to int
		
		result += a;//result = result + a;
		System.out.println(result);// 5
	}

}
