package com.arrays;

//WAP to print Sum and Avg of the given array..?
public class SumAndAvg {

	public static void main(String[] args) {
		int[] marks = {61, 65, 58, 49, 72, 63};

		double sum = 0;
		double avg = 0;
		for(int i  = 0; i < marks.length; i++) {
			sum = sum + marks[i];//61 + 62 = 123 + 58 --so on
		}
	 
		System.out.println("Sum of the Marks : " + sum);//386	
		
		
		avg = sum / marks.length;
		
		System.out.println("Avg of all the elements : " + avg);//386/6 = 61
		
	}

}
