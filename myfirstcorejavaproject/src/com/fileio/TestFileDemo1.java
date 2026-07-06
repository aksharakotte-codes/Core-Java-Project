package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Method Started");
		
		File f = new File("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akhi.txt");
		
//		Atomically creates a new, empty file named by this abstract pathname 
//		if and only if a file with this name does not yet exist.
		boolean status = f.createNewFile();
		 
		if(status) {
			System.out.println("File has been created successfully!!");
		} else {
			System.out.println("Something went wrong or File Already exist");
		}
		System.out.println("Main Method Ended");
	}

}
