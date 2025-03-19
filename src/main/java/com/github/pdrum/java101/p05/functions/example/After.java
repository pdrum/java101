package com.github.pdrum.java101.p05.functions.example;

import java.util.Scanner;

public class After {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of number do you want to add up:");
        String nameOfFunctionality = scanner.nextLine();

        System.out.println("Enter threshold (exclusive)");
        int threshold = scanner.nextInt();

        if ("even".equals(nameOfFunctionality)) {
            printSumOfEvenNumbersUntil(threshold);
        } else if ("prime".equals(nameOfFunctionality)) {
            printSumOfPrimeNumbersUntil(threshold);
        } else {
            System.out.println("Unsupported");
        }
    }

    public static void printSumOfEvenNumbersUntil(int exclusiveThreshold) {
        int sum = 0;
        for (int number = 0; number < exclusiveThreshold; number++) {
            if (isEven(number)) {
                sum += number;
            }
        }
        System.out.println(sum);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printSumOfPrimeNumbersUntil(int exclusiveThreshold) {
        int sum = 0;
        for (int number = 0; number < exclusiveThreshold; number++) {
            if (isPrime(number)) {
                sum += number;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int number) {
        for (int smallerNumber = 2; smallerNumber < number; smallerNumber++) {
            if (number % smallerNumber == 0) {
                return false;
            }
        }
        return number != 0 && number != 1;
    }
}
