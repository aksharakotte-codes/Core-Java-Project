package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo8 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main Method Started");

		FileWriter fw = new FileWriter("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akshara1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(65);
		bw.write(66);
		bw.newLine();
		bw.write("Chill ");
		bw.newLine();
		bw.write("Try to be Active");
		bw.newLine();
		bw.write("Focus on Learning");
		bw.newLine();
		
		bw.flush();
		bw.close();
		fw.close();

	}

}
