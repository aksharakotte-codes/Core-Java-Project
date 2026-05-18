package com.arrays;

import java.util.Scanner;

public class TestArraysDemo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();    
		
		String[] names = new String[size];
		
		names[0] = "Abhishek";
		names[1] = "Ishan";
		names[2] = "Sanju";
		names[3] = "Tilak";
		names[4] = "Surya";
		
		//for each loop 
		for(String name : names) {
			System.out.println(name);
		}
		
//		for (int   i = 0; i < size; i++) {
//			System.out.println(names[i]);
//		}
		
		sc.close();

	}

}
