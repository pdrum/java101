package com.github.pdrum.java101.p05.functions.exercise1;

import java.util.Scanner;

public class Before {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of number do you want to add up:");
        String nameOfFunctionality = scanner.nextLine();

        System.out.println("Enter threshold (exclusive)");
        int threshold = scanner.nextInt();

        if ("even".equals(nameOfFunctionality)) {

            int sum = 0;
            for (int number = 0; number < threshold; number++) {
                if (number % 2 == 0) {
                    sum += number;
                }
            }
            System.out.println(sum);

        } else if ("prime".equals(nameOfFunctionality)) {

            int sum = 0;
            for (int number = 0; number < threshold; number++) {
                boolean isPrime = true;

                if (number == 0 || number == 1) {
                    isPrime = false;
                }
                for (int smallerNumber = 2; smallerNumber < number; smallerNumber++) {
                    if (number % smallerNumber == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    sum += number;
                }
            }

            System.out.println(sum);

        } else {
            System.out.println("Unsupported");
        }
    }
}
