package com.stringhandling;
//WAP to print the Duplicate elements in a Given String..?
// Java --> a
import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.nextLine();//Javav
        String result = "";
		
		for(int i = 0; i< str.length(); i++) {
			char c = str.charAt(i);
			
			if(str.indexOf(c) != str.lastIndexOf(c) && result.indexOf(c) == -1) {
				System.out.println("Printing the Duplicate elements from the Given String : " + c);//av
				result = result + c;//av
			}
		}	
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
