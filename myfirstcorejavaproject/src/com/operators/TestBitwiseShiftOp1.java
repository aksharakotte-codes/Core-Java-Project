package com.operators;

//Bitwise--> Shift operators (<<,>>, >>>)
public class TestBitwiseShiftOp1 {

	public static void main(String[] args) {
		int a = 77;
		int b = 2;
		
		System.out.println(a << b);//Left Shift Operator//308
		System.out.println(15 << 2);//Left Shift Operator//60
		System.out.println(54 << 3);//432
		System.out.println(5 << 2);//20
		
		int a1 = 87;
		int b2 = 2;
		
		System.out.println(a1 >> b2);//Right Shift Operator//19
		System.out.println(15 >> 2);//Right Shift Operator//3
		System.out.println(54 >> 3);//6
		System.out.println(5 >> 2);//1
		
		System.out.println(15 >>> 2);//Unsigned Right Shift//3
		
//		int a3 = -5;
//		int a4 = 1;
//
//		System.out.println(a3 >>> a4);//Unsigned Right Shift

	}

}
