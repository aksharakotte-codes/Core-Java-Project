package com.logicalstatements;

import java.util.Scanner;

//WAP to print Cricketer info based on the jersey Number ..?
public class TestLSSwitchDemo1 {

	public static void main(String[] args) {
		System.out.println("Cricketer Info !!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a jersey Number to get the details");
		int jno = sc.nextInt();

//		Old way of using switch case with break function
		switch(jno) {
		case 7 :
			System.out.println("Thala for a Reason");
			System.out.println("The one only best and cool caption Mr.MS Dhoni !!");
			break;
		
		case 18:
			System.out.println("King Kohil");
			System.out.println("The most consistent player in India");
			break;
			
		case 45:
			System.out.println("The Hit Man");
			System.out.println("A good Caption & also a good Hitter");
			break;
			
		default :
			System.out.println("Entered Jersey Number details not added here.!! ");
			
		sc.close();	
		}
	}

}
