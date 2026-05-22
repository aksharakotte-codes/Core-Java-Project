package com.starpatterns;

//Output
//******
// *****
//  ****
//   ***
//    **
//     *
public class StarPatterns5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 6; k >= i; k--) {
				System.out.print("*");
//				System.out.print("* ");//this prints reverse pyramid

			}
			System.out.println();
		}

	}

}
