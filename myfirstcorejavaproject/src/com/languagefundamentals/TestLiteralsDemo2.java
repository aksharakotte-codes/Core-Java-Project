package com.languagefundamentals;


//Floating Literals
//byte --> short --> int --> long --> float --> double
public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		float f1 = 100;// int --> float
		float f2 = 0123;// octal --> int --> float
		float f3 = 123F;//float
//		float f4 = 123.5;// invalid : double cannot convert into float
		float f5 = 123.5F;//float
		float f6 = 0x123;//Hexa -->int --> float
//		float f7 = 0123.5;//whether the value consists of point then its not octal its double invalid : double cannot convert into float
		float f7 = 0123.5F;//float -->123.5 
//		float f8 = 0x123.5F;// invalid Hexa literal number 
		float f9 = 0x123F;//Hexa decimal to float
		float f10 = 1230.5F;//float
		
		//Decimal
		double num = 10.5f;
		double value = 0.25;
		
		System.out.println(num);
		System.out.println(value);
		
		//Exponential form
		double number = 1.2e3;   // 1.2 × 10³ = 1200
		double small = 5.6E-2; // 5.6 × 10⁻² = 0.056
		
		
		System.out.println(number);
		System.out.println(small);
		
		System.out.println(f1); //100.0
		System.out.println(f2);//83.0
		System.out.println(f3);//123.0
//		System.out.println(f4);
		System.out.println(f5);//123.5
		System.out.println(f6);//291.0
//		System.out.println(f7);
		System.out.println(f7);//123.5
//		System.out.println(f8);
		System.out.println(f9);//4671.0
		System.out.println(f10);//1230.5

	}

}
