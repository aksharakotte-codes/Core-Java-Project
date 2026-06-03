package com.exceptionhandling.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		File f = new File("C:\\Users\\ruthw\\OneDrive\\Batch 70\\text\\batch70_1.txt");
		try (FileReader fr = new FileReader(f)) {
			try {
				int i = fr.read();
				
				while(i != -1) {
					System.out.print((char)i);
					i = fr.read();
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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