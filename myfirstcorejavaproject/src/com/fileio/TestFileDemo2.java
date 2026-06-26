package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo2 {

	public static void main(String[] args) throws IOException {
        System.out.println("Main Method Started");
		
		File f = new File("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akshara1.pdf");
//		f.delete();
		boolean isExist = f.exists();
		
		if(!isExist) {
			f.createNewFile();
			System.out.println("File has been created successfully!!");
		} else {
			System.out.println("The file is already available !!");
		}
        System.out.println("Main Method Ended");
		
	}

}
