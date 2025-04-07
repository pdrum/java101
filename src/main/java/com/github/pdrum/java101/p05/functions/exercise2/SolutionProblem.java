package com.github.pdrum.java101.p05.functions.exercise2;
import java.util.Scanner;
public class SolutionProblem {

    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int sum = sum(number1, number2, number3);
        System.out.println("The sum of the three numbers is: " + sum);

        int max = findMax(number1, number2, number3);
        System.out.println("The maximun is: " + max);
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}