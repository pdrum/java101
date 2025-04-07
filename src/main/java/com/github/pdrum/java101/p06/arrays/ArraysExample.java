package com.github.pdrum.java101.p06.arrays;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        int[] prefilledArray = {9, 8, 7, 2, 9};
        System.out.println(prefilledArray[1]);

        int index = 3;
        System.out.println(prefilledArray[index]);

        System.out.println("**********");

        // Iterating over indexes
        for (int i = 0; i < prefilledArray.length; i++) {
            int numberInArray = prefilledArray[i];
            System.out.println(numberInArray);
        }

        System.out.println("$$$$$$$$$$");

        // iterating over values
        for (int numberInArray : prefilledArray) {
            System.out.println(numberInArray);
        }

        System.out.println("&&&&&&&&&");

        // setting the values in a loop
        int[] toThePowerOfTwo = new int[5];
        for (int i = 0; i < toThePowerOfTwo.length; i++) {
            toThePowerOfTwo[i] = i * i;
            System.out.println(toThePowerOfTwo[i]);
        }

        System.out.println("^^^^^^^^");
        Scanner scanner = new Scanner(System.in);
        int[] anotherArray = new int[scanner.nextInt()];
        System.out.println(anotherArray[0]);
    }
}
