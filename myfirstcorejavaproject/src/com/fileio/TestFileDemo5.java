package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
		System.out.println("Main Method Started");

		FileReader fr = new FileReader("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akhi.txt");
	    
//	    Reads a single character.
	    int i = fr.read();//71
	    
	    while(i != -1) {
	    	System.out.print((char) i);
	    	i = fr.read();
	    	Thread.sleep(500);
	    }
	    
	    fr.close();
	}

}
