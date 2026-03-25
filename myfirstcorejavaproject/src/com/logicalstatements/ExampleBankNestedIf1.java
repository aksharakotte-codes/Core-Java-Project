package com.logicalstatements;

import java.util.Scanner;

public class ExampleBankNestedIf1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter applicant salary ..?");
		double salary = sc.nextDouble();
		
		if(salary >= 35000) {
			System.out.println("Okay !! Then Enter your Credit score");
			int credit = sc.nextInt();
			
			if(credit >= 750) {
				System.out.println("Loan Approved");
			} else {
				if(credit >= 650) {
					System.out.println("Loan Approved with soome specific Conditions");
				} else {
					System.out.println("Loan Rejected");
				}
			}
			
		} else {
			System.out.println("Sorry!!Not Eligible due to low salary");
		}
		sc.close();
		System.out.println("Main Method Ended!!");
	}

}
