package com.fileio;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	String username = "Akshara";
	transient String password = "Akhi@01";
	int age = 21;
	long phone = 6281123263L;
}
public class TestEmployeeSerializationDemo1 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Method Started !!");
		
		//Serialization
		Employee emp1 = new Employee(); 
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ruthw\\OneDrive\\Documents\\Batch 70\\test\\Akhi\\java123.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		oos.close();  
		fos.close();
		
		System.out.println("Main Method Ended !!");
	}

}
