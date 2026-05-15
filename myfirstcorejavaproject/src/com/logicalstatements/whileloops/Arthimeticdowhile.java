package com.logicalstatements.whileloops;

//WAP for continuing Arithmetic operations one by one using do-while..?
import java.util.Scanner;

public class Arthimeticdowhile {

	public static void main(String[] args) {
        System.out.println("Main Method Started!!!");
		                                                          
        
        
        
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {

			System.out.println("Enter a number : " );
			int a = sc.nextInt();
			
			System.out.println("Enter b number : ");
			int b = sc.nextInt();
			
			System.out.println("Enter a Symbol to proceed like + - * % / !!");
			String symb = sc.next();
			
			switch(symb) {
			case "+" -> System.out.println(a + b);
			case "-" -> System.out.println(a - b);
			case "*" -> System.out.println(a * b);
			case "%" -> System.out.println(a % b);
		    case "/" -> System.out.println(a / b);
		    default -> System.out.println("Invalid symbol to proceed ");
			}
			
			System.out.println("Do you want to Continue ..? Click Y for Yes N for No ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));
		
		sc.close();
	} 
}
