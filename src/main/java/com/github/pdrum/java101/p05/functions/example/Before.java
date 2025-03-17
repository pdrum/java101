package com.github.pdrum.java101.p05.functions.example;

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

                for (int smallerNumber = 0; smallerNumber < number; smallerNumber++) {
                    if (smallerNumber != 0 && smallerNumber != 1 && number % smallerNumber == 0) {
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
