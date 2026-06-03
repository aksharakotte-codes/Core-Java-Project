package com.exceptionhandling.checked;
//Abnormal Termination
import java.io.File;
import java.io.IOException;

public class IOException2 {

	public static void main(String[] args) throws IOException, ArithmeticException {
		System.out.println("Main Method Started");
		
//		System.out.println(10/0);
		File f = new File("C:\\Users\\ruthw\\OneDrive\\Batch 70\\text\\batch70_1.txt");
		
		boolean status = f.createNewFile();//Unhandled exception type IOException
		
		if(status) {
			System.out.println("File created Successfully");
		} else {
			System.out.println("Something went wrong");
		}
		
		System.out.println("Main Method Ended");
	}

}

//Output is If Iam wantedly gives wrong pathname, So it is not going to Create a file in my laptop
//Accordingly it will throws an IOException and stops exceuting remaining lines of a code

