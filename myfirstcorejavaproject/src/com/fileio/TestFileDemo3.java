package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo3 {

	public static void main(String[] args) throws IOException {
		System.out.println("Maain Method Started");
		
		File f = new File("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akhi");
		
		System.out.println(f.isDirectory());//true
		System.out.println(f.isFile());//false
		
//		For finding the path use below 4 from any one
		System.out.println(f.getAbsolutePath());//String
		System.out.println(f.getAbsoluteFile());//File
		System.out.println(f.getCanonicalPath());//String
		System.out.println(f.getCanonicalFile());//File
		
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
//		boolean status = f.mkdir();
//		
//		if(status) {
//			System.out.println("Directory has been Created succcessfully");
//		} else {
//			System.out.println("Something went wrong");
//		}
		
		System.out.println("Maain Method Ended");
	}

}
