package com.languagefundamentals.methods;

public class ExampleofPrintPrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Priniting Odd Numbers from 1 to 50");
		getPrimes(50,2);

	}
	static void getPrimes(int a, int b) {
        if (b > a) {
            return;
        }

        if (isPrime(b, 2)) {
            System.out.println(b);
        }

        getPrimes(a, b + 1);
    }

    static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }
}