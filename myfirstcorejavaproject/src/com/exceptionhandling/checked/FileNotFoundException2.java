package com.exceptionhandling.checked;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Main Method Started !!");
		
		File f = new File("C:\\Users\\ruthw\\OneDrive\\Batch 70\\text\\batch70_1.txt");
		try (FileReader fr = new FileReader(f)) {//Unhandled exception type FileNotFoundException
			int i = fr.read(); 
			
			while(i != -1) {
				System.out.print((char)i);
				i = fr.read();
				Thread.sleep(500);
			}
		}
	
		System.out.println();
		System.out.println("Main Method Ended !!");
	}                  

}

//Output 
//Main Method Started !!
//Good Morning Guys,
//Have a nice day // this data from created file batch 70 --> text --> batch70_1 
//Main Method Ended !!
