package com.arrays;

public class OptimizedBubbleSort {

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        int[] arr = {30, 40, 20, 15, 5, 2};

        int passCount = 0;
        int swapCount = 0;

        System.out.println("Sorted array : Before Sort");

        for (int a : arr) {
            System.out.print(a + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {

            passCount++;
            swapCount = 0;

            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                    swapCount++;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println();
        System.out.println(swapCount);
        System.out.println(passCount);

        System.out.println("Sorted array : After Sort");

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}