package com.github.pdrum.java101.p05.functions.exercise2;

import java.util.Scanner;

public class NumberAnalyzer {

    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static int sum = 0;
    public static int evenCount = 0;

    /**
     * Compares the
     */
    public static void updateMax(int newNumber) {}

    // Function to update the minimum value
    public static void updateMin(int newNumber) {}

    public static void updateSum(int newNumber) {}

    // Function to check if a number is even
    public static void updateEvenCount(int number) {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for how many numbers they want to enter
        System.out.print("How many numbers will you enter? ");
        int n = scanner.nextInt();

        // Step 2: Loop to take input and update values using functions
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
        }

        // Step 3: Display the results
        System.out.println("\nMaximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + ((float) sum / n));
        System.out.println("Number of even values: " + evenCount);

        scanner.close();
    }
}
