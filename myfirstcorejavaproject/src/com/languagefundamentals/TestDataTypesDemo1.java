package com.languagefundamentals;

public class TestDataTypesDemo1 {
	
//	Byte ( -2^7 to 2^7)
	
//	Range from -128 to 127
//	By default RHS numerical values is int
	byte b;
	
//	If we give, more than byte value we will get below Compile Time Error
//	Compile Time Error :Type mismatch: cannot convert from int to byte
	byte b1 =(byte) 128;// 127+1= 128 then -1(MSB)=-128
//	Type casting : Converting one data type value into another data type
	byte b2 =(byte) 132;// Explicit Type Casting -->"-124" 125 126 127 128 (count in reverse 128+4=132 the -4=-124)
	byte b3 =(byte) 256;//0
	
	
//	Short 
//	if we give more than 32767 will get 
//	Range for short from -32768 to 32767
//	Compile Time Error :Type mismatch: cannot convert from int to short
//  2 bytes ---> 32767 (-2^15 to 2^15)
	short s ;// 0
	short s1 = (short)32768 ;//-32768
	
	
	
//	Int
	
//	Range for int from -2147483648 to 2147483647 (-2^31 to 2^31) ---> 8 bytes
	int i = b; // Converting byte into int --> Implicit Type Casting // 127
	int i1 = 2147483647; //2147483647
//	The literal 2147483648 of type int is out of range 
//	Compile Time Error :Type mismatch: cannot convert from long to int : when the value is in long 
	int i2 = (int) 2147483648L;// -2147483648
	
	
//   Long

//	Range for long from -9223372036854775808 to 9223372036854775807
//	(-2^63 to 2^63) ---> 16 bytes
	 
   	long l;//0
	
	long l1 = 9223372036854775807L;//9223372036854775807
	long l2 =  2147483648L;//2147483648
	
//	Float
	
	// Decimal point of Data types
	//By default RHS value is double
	float f;//0.0
	float f1 = 5.9F;//5.9
	float f2 = (float) 4353454.875655467;// 4353455.0
	float f3 = 9223372036854775806756465F;//9.223372E24
	
	
//	Double
	
	
	double d;//0.0
	double d1 = 4000.00D;
	
	
//	Character
	
	char c;
//	Range is from 2 bytes = 16bits --> 0 to 65535
//	-32768 + 32767 = 65535(it only takes positive values doesn't accept negative values)
	char c1 = 'M'; // To store single character will use char
//	Can we store numerical into characters..? yes you can store
//	It will consider as ASCII values
//	A-Z = 65 to 90
//	a-z = 97 to 122
	char c2 = 97;
	char c3 = 72; // int can convert into char : Implicit type casting
	char c4 = '\u0040'; //Unicode or hex characters 
	
	
	int i3 = 'A'; // Converting char to int 
	
	
//	Boolean
	
	boolean boo;
//	boolean boo1 = true;
	boolean boo2  = false;
	boolean areYouGiving100A = true;
	
	
//	All are invalid for boolean because java is case-sensitive only satisfies true or false 
/*	boolean boo1 = 0;
	boolean boo2 = 1;
	boolean boo3 = TRUE;
	boolean boo4 = FALSE;
	boolean boo5 = "True";
	boolean boo6 = "False";
	boolean boo7 = True;
	boolean boo8 = False; */
	
	public static void main(String[] args) {
		System.out.println("Main Method started !!!");
		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();
		
		System.out.println("Byte1 value:" +t1.b);//0
		System.out.println("Byte2 value:" +t1.b1);//127
		System.out.println("Byte3 value:" +t1.b2);//-124
		System.out.println("Byte4 value:" +t1.b3);//0
		
		System.out.println("Short1 value:" +t1.s);//0
		System.out.println("Short2 value:" +t1.s1);//0
		
		System.out.println("Int1 Value:" +t1.i);//0
		System.out.println("Int2 Value:" +t1.i1);//2147483647
		System.out.println("Int3 Value:" +t1.i2);//-2147483648
		
		
		
		System.out.println("Long1 Value:" +t1.l);//0
		System.out.println("Long2 Value:" +t1.l1);//9223372036854775807
		System.out.println("Long3 Value:" +t1.l2);//2147483648
		
		System.out.println("Float1 Value:" +t1.f);//0.0
		System.out.println("Float2 Value:" +t1.f1);//5.9
		System.out.println("Float3 Value:" +t1.f2);//4353455.0
		System.out.println("Float4 Value:" +t1.f3);//5.9
		
		
		System.out.println("Double1 Value:" +t1.d);// 0.0
		System.out.println("Double2 Value:" +t1.d1);//4000.0
		
		System.out.println("Character1 Value:" + t1.c);// empty space
		System.out.println("Character2 Value:" + t1.c1);//M
		System.out.println("Character3 Value:" + t1.c2);//a
		System.out.println("Character4 Value:" + t1.c3);//H
		System.out.println("Character5 Value:" + t1.c4);//@
		System.out.println("Int4 Value:" +t1.i3);//65
		
		
//		if (t1.boo1)
//		if (t1.boo2){
//		System.out.println("Boolean1 Value:" +"Prints True");
//    	}
		
		
		
		if (t1.areYouGiving100A){
			System.out.println("Boolean Value2:" +"You will get a job in 2026");
	    	} else {
	    		System.out.println("Boolean Value3:" +"You will get a job in 2027");
	    	}
		
		System.out.println(t1.boo);// false
	}

}
