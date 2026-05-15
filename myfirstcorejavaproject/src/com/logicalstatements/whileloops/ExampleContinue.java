package com.logicalstatements.whileloops;
//continue used to help to skip the middle number
//Below program skips "5" and prints another numbers
public class ExampleContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
