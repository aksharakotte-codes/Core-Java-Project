package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestEmployeeDeSerializationDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Main Method Started !!");
		
		// De-serialization
		FileInputStream fis = new FileInputStream("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akhi\\java123.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee obj = (Employee)ois.readObject();
	
		System.out.println(obj.username);
		System.out.println(obj.password);
		System.out.println(obj.age);
		System.out.println(obj.phone);
		
		ois.close();
		fis.close();
	}

}
 