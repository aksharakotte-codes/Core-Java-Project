package com.starpatterns;
//output
//     *
//    **
//   ***
//  ****
// *****
//******

public class StarPatterns4 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		for(int i = 1; i <= 6; i++) {
			for(int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
//   				System.out.print(" *");//--> this prints pyramid shape of stars
				
			}
			System.out.println();
		}
	}	 
}
