package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFileDemo6 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Method Started");

		FileReader fr = new FileReader("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akhi.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		Reads a line of text
		String st = br.readLine();
		
		while(st != null) {
			System.out.println(st);
			st = br.readLine();
			Thread.sleep(500);
		}
		
		br.close();
		fr.close();
	}

}
