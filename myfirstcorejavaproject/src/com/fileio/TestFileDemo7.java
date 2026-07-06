package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo7 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Method Started");

		FileWriter fw = new FileWriter("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akshara1.txt");
		
		fw.write(65);
		fw.write('\n');
		fw.write("Have a Nice Day");
		fw.write('\n');
		fw.write("Files concepts are crazy !");
		fw.write('\n');
		
		fw.flush();
		fw.close();

	}

}
