package com.stringhandling;

public class TestStrDemo23 {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!");
		
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb1.capacity());//20
		sb1.append("SrikanthSrikanth");// 20
		sb1.append("Srikanth");// 20 * 2 + 2 --> 40 + 2 --> 42
		sb1.append("SrikanthSrikanth");// 42 * 2 + 2 --> 84 + 2 --> 86
		sb1.append("SrikanthSrikanthSrikanthSrikanthSrikanthSrikanth");// 86 * 2 + 2 --> 172 + 2 --> 174
		System.out.println(sb1.capacity());//20 --> 42 --> 86 --> 174
		System.out.println("--------------------");
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("Java");//16
		sb2.append("Srikanth");//16
		sb2.append("Srikanth");// 16 * 2 + 2 --> 32 + 2 = 34
		System.out.println(sb2.capacity());// 16 --> 34
		
		StringBuffer sb3 = new StringBuffer("Java is Simple");
		sb3.delete(8, 14);
		System.out.println(sb3);//Java is 
		sb3.deleteCharAt(5);
		System.out.println(sb3);// Java s  
		
		
		StringBuffer sb4 = new StringBuffer();//16
//		sb4.ensureCapacity(16);// 16
//		sb4.ensureCapacity(17);// 34
		sb4.ensureCapacity(100);// 100
		System.out.println(sb4.capacity());//16 --> 34 --> 100
		System.out.println("Main Method Ended");
	}
}
