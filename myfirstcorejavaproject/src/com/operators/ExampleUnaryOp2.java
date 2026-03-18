package com.operators;

//Unary Operators
public class ExampleUnaryOp2 {

	public static void main(String[] args) {
		int a = 3;
		System.out.println(a++);//3(prints) --> 4 (then Increments)
		System.out.println(++a);//5 
		System.out.println(a);//5
		System.out.println("***************************");
		
		int x = 7;
		System.out.println(x++ + ++x);// 7 + 9 = 16
		System.out.println(x);//9
		System.out.println("***************************");
		
		int i = 5;
		int j = 2;
		System.out.println(i++ + j-- + ++i + --j); //5 + 2 + 7 + 0 = 14
		System.out.println(i);//7
		System.out.println(j);//0
		System.out.println("***************************");
		
		int b = 3;
		System.out.println(b++ + b++ + ++b);// 3 + 4 + 6 = 13
		System.out.println(b);//6
		System.out.println("***************************");
		
		
		int c = 3;
		System.out.println(c++ + ++c + c++ + ++c);// 3 + 5 + 5 + 7 = 20
		System.out.println(c);//7
		System.out.println("***************************");
		
		int g = 6;
		int h = 3;
		System.out.println(g-- - --h + ++ g); //6 - 2 + 6 = 10
		System.out.println(g);//6
		System.out.println(h);//2
		System.out.println("***************************");
	}

}

