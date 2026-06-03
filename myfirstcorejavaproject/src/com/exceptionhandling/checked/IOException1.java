package com.exceptionhandling.checked;
//IOException Example 

//Grateful Termination
import java.io.File;
import java.io.IOException;

//All Exceptions occurs at Runtime only, whereas Checked Exceptions appear in two places like below 
//(i)When we call CreateNewFile() Method 
//     Compiler checks at compile-time is not Exception actually will consider as Pre-Checking by the Compiler like a warning bell.
//(ii)But, Actual Exception comes at Runtime only when we don't have proper path
public class IOException1 {
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		File f = new File("C:\\Users\\ruthw\\OneDrive\\Batch 70\\text\\batch70.txt");
		
//		f.createNewFile();//Unhandled exception type IOException
		try {
			f.createNewFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Method Ended");

	}

}

//Output is "Creates a file" in Batch 70--> text folder in my laptop
