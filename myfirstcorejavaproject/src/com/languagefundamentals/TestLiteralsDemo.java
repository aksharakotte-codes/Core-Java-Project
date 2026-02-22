package com.languagefundamentals;

public class TestLiteralsDemo {

	public static void main(String[] args) {
		
//		Binary Literals ---> Base 2 --> 0 to 1
//		Its starts with 0b or 0B
		int a14 = 0b1010;
		//1 0 1 0 = 1*2^3 0*2^2  1*2^1  0*2^0 = 8 + 0 + 2 + 0 = 10
		int a15 = 0b10111;
		//1 0 1 1 1 = 1*2^4 0*2^3  1*2^2 1*2^1  1*2^0 = 16 + 0 + 4 + 2 + 1 = 23
		int a16 = 0b1100;
		//1 1 0 0 = 1*2^3 1*2^2  0*2^1  0*2^0 = 8 + 4 + 0 + 0 =12
		int a17 = 0b0110;
		//0 1 1 0 = 0*2^3 1*2^2  1*2^1  0*2^0 =0 + 4 + 2 + 0 = 6
		
		System.out.println(a14);//10
		System.out.println(a15);//23
		System.out.println(a16);//12
		System.out.println(a17);//6
		
		
//		Hexa Decimal Literals : Base is 16 --> 0 to 9 & a-f or A-F
//		a/A = 10, b/B = 11, c/C = 12, d/D = 13, e/E = 14, f/F = 15
//		Hexa Decimal Literals,we can represent with 0X 0r 0x
		int a7 = 0x123;
		//0 1 2 3 = 0*16^3 1*16^2 2*16^1 3*16^0 = 0 + 256 + 32 + 3 =291
		
		int a8 = 0x567;
		//0 5 6 7 = 0*16^3 5*16^2 6*16^1 7*16^0 = 0 + 1280 + 96 + 7 = 1383
		int a9 = 0x6789;
		// 0 6 7 8 9 =  0*16^4 6*16^3 7*16^2 8*16^1 9*16^0= 0 + 24576 + 1792 + 128 + 9 = 26505
		int a10 = 0xabc;
		// 0 a b c =  0*16^3 a*16^2 b*16^1 c*16^0 = 0 + 2560 + 176 + 12 = 2748
		int a11 = 0X1a2b3c;
		// 0 1 a 2 b 3 c = 0*16^6 1*16^5 a*16^4 2*16^3 b*16^2 3*16^1 c*16^0 
		// 0 + 1048576 + 655360 + 8192 + 2816 + 48 + 12 = 1715004
		int a12 = 0XDAD;
		// 0 D A D = 0*16^3 D*16^2 A*16^1 D*16^0 = 0 + 3328 + 160 + 13 = 3501
//		int a13 = 0xDeer; //Syntax error on token "r", delete this token
		
		
		System.out.println(a7);//291
		System.out.println(a8);//1383
		System.out.println(a9);//26505
		System.out.println(a10);//2748
		System.out.println(a11);//1715004
		System.out.println("****:"+a12);//3501

			
//		Decimal Literals : Base is 10 --> 0 to 9 numbers we can store here.  
		int a1 = 123;
		int a2 = 56789;
		
		System.out.println(a1);
		System.out.println(a2);
		
//		Octal Literals : Any number starts with 0 will consider as Octal.
//		Base is 8 --> 0 to 7 numbers we can store here.
		int a3 = 0123;//83
		// 0 1 2 3 = 0*8^3 1*8^2 2*8^1 3*8^0 = 0 + 64 + 16 + 3 = 83
		
		int a4 = 0345;//229
		// 0 3 4 5 = 0*8^3 3*8^2 4*8^1 5*8^0 = 0 + 192 + 32 + 5 = 229 
		
		int a5 = 0567;//375
		// 0 5 6 7 = 0*8^3 5*8^2 6*8^1 7*8^0 = 0 + 320 + 48 + 7 = 375
		
		int a6 = 034567;//14711
		// 0 3 4 5 6 7= 0*8^5 3*8^4 4*8^3 5*8^2 6*8^1 7*8^0 
//		= 0 + 12288 + 2048 +  320 + 48 + 7 = 14711
		
		
//		The literal 0789 of type int is out of range 
//		int a8 = 0789;
		
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);


	}

}
