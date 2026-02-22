package com.languagefundamentals;

public class TestDataTypesDemo3 {

	public static void main(String[] args) {
//		Auto-Boxing converts int -->Integer
//		From primitive data type into wrapper class
//		Integer
		int a1 = 10;
		Integer b1 = a1;
		System.out.println("Auto-Boxing for Integer:" +b1);
		
		
//		Byte
		byte a2 = 20;
		Byte b2 = a2;
		System.out.println("Auto-Boxing for Byte:" +b2);
		
//        Integer b1 = b2 ; (converting byte into int --> is not possible with different primitive data types types to wrapper object )    
//        System.out.println(b1); (We cannot convert from different primitive data types types to wrapper class 
//		  object it only works for same primitive data types and wrapper object only )
		
		
//		127 is inside cache range (-128 to 127)
//		Java reuses the same object
//		Both i1 and i2 point to the same memory location
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		
//		128 is outside cache range
//		Java creates new separate objects
//		i3 and i4 point to different memory locations
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);

		
		
//		Auto-UnBoxing converts Integer --> int
//		From wrapper class into primitive data type 
//		Integer
		Integer c3 = 30;
		int d3 = c3;
		System.out.println("Auto-UnBoxing for Integer:" +d3);
		
		
		
	}

}
