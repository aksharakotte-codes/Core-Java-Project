package com.starpatterns;

//Output
//*          *
//**        **
//***      ***
//****    ****
//*****  *****
//************
//*****  *****
//****    ****
//***      ***
//**        **
//*          *

public class StarPatterns7 {

    public static void main(String[] args) {
    	
        // Upper Half
        for (int i = 1; i <= 6; i++) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 1; j <= 2 * (6 - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = 6 - 1; i >= 1; i--) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 1; j <= 2 * (6 - i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}