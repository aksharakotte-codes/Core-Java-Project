package com.arrays;
public class TestSwap {

	public static void main(String[] args) {
		
		//with using third variable
		int x = 10;
		int y = 20;
		int temp = 0;
		
		temp = x;
		x = y;
		y = temp;
		
		
		System.out.println("X value is : " + x);//20
		System.out.println("Y value is : " + y);//10
		System.out.println("************************");
		
		int a = 100;
		int b = 200;
		
		//using XOR operation and without using third variable
		a = a + b;//300
		b = a - b;//100
		a = a - b;//200
		
		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);

	}

}
