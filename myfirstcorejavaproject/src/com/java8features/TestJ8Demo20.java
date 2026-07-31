package com.java8features;
//WAp to print random OTP evertime.

import java.util.function.Supplier;

public class TestJ8Demo20 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
//		Returns a double value with a positive sign,
//		greater than or equal to 0.0 and less than 1.0. 
//		System.out.println(Math.random() * 10);// 0 to 1 -->
		
		Supplier<String> s = ()	-> 	{
			String otp = "";
			
			for(int i = 1; i <= 6; i++) {
				otp = otp + (int)(Math.random() * 10);
			}
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println("Main Method Ended");
	}

}
