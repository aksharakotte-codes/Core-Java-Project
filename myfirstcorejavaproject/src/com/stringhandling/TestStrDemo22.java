package com.stringhandling;

public class TestStrDemo22 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());//0
		System.out.println(sb1.capacity());//16
		System.out.println("---------------------------");
		
		StringBuffer sb2 = new StringBuffer("Srikanth");
		System.out.println(sb2.length());//8
		System.out.println(sb2.capacity());//24
		System.out.println("---------------------------");
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Srikanth");
		System.out.println(sb3.capacity());//16
		System.out.println("---------------------------");
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append("SrikanthSrikanthSrikanth");
		System.out.println(sb4.capacity());// CurrentCapacity * 2 + 2 = 34
		System.out.println("---------------------------");
		
		StringBuffer sb5 = new StringBuffer();
		sb5.append("SrikanthSrikanthSrikanthSrikanthSrikanth");
		System.out.println(sb5.capacity());
		// CurrentCapacity * 2 + 2 = 34 --> 35 + kanth(5) --> 40
		System.out.println("---------------------------");
		
		StringBuffer sb6 = new StringBuffer();
		sb6.append("SrikanthSrikanth");//16
		sb6.append("SrikanthSrikanth");// 16 * 2 + 2 = 32 + 2 = 34 
		sb6.append("SrikanthSrikanthSrikanthSrikanthSrikanth");// 35 * 2 + 2 = 70 + 2 = 72
		sb6.append("SrikanthSrikanthSrikanthSrikanthSrikanthSrikanthSrikanthSrikanthSrikanth");// 72 * 2 + 2 = 144 + 2 = 146 
		sb6.append("Srikanth");// 146 * 2 + 2 = 292 + 2 = 294 
		System.out.println(sb6.capacity());//16 --> 34 --> 72 --> 146 --> 294
		System.out.println("---------------------------");
		
		System.out.println("Main Method Ended!!");
	}

}
