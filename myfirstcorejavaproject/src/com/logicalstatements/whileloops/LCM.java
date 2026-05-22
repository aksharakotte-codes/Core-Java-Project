package com.logicalstatements.whileloops;

public class LCM {

	public static void main(String[] args) {
		int a= 4, b = 10;
		int max = Math.max(a, b);//1 0
		
		 while(true) {
			 if(max % a == 0 && max % b == 0) {
				 System.out.println("LCM value is : " + max);
				 break;
			 }
			 max++;
		 } 

	}

}
