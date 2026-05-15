package com.logicalstatements.whileloops;
//break used to help for stopping the loop and coming out of it, 
// doesn't care about i value
public class ExampleBreak {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}

	}

}
