package com.operators;

public class Task1 {

	public static void main(String[] args) {
		int x = 3;
		int y = x << 2 + 1;
		
		System.out.println(y);//24
		
		int a = 8;
		int b = 2;
		int c = a >> b << 1;
		
		System.out.println(c);//4
		
		System.out.println(1 << 2 << 3);//32
		
		int x1 = 5;
		int y1 = (x1 > 3) ? x1++ : ++x1;
		System.out.println(y1);//5
		
		System.out.println(x1+ "" +y1);//65

	}

}
