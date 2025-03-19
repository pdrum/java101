package com.github.pdrum.java101.p05.functions.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfterTest {

    @Test
    public void testSumOfEvenNumbersUntil10() {
        String input = "even\n10\n";
        String expectedOutput = "What type of number do you want to add up:\n" +
                "Enter threshold (exclusive)\n" +
                "20\n";

        assertEquals(expectedOutput, runMainWithInput(input));
    }

    @Test
    public void testSumOfPrimeNumbersUntil10() {
        String input = "prime\n10\n";
        String expectedOutput = "What type of number do you want to add up:\n" +
                "Enter threshold (exclusive)\n" +
                "17\n"; // Primes under 10 are 2, 3, 5, 7 -> sum = 17

        assertEquals(expectedOutput, runMainWithInput(input));
    }

    @Test
    public void testUnsupportedFunctionality() {
        String input = "odd\n10\n";
        String expectedOutput = "What type of number do you want to add up:\n" +
                "Enter threshold (exclusive)\n" +
                "Unsupported\n";

        assertEquals(expectedOutput, runMainWithInput(input));
    }

    @Test
    public void testSumOfEvenNumbersUntil0() {
        String input = "even\n0\n";
        String expectedOutput = "What type of number do you want to add up:\n" +
                "Enter threshold (exclusive)\n" +
                "0\n";

        assertEquals(expectedOutput, runMainWithInput(input));
    }

    @Test
    public void testSumOfPrimeNumbersUntil0() {
        String input = "prime\n0\n";
        String expectedOutput = "What type of number do you want to add up:\n" +
                "Enter threshold (exclusive)\n" +
                "0\n";

        assertEquals(expectedOutput, runMainWithInput(input));
    }

    @Test
    public void testSumOfEvenNumbersWithNegativeThreshold() {
        String input = "even\n-5\n";
        String expectedOutput = "What type of number do you want to add up:\n" +
                "Enter threshold (exclusive)\n" +
                "0\n"; // Sum of even numbers below a negative threshold should be 0

        assertEquals(expectedOutput, runMainWithInput(input));
    }

    @Test
    public void testSumOfPrimeNumbersWithNegativeThreshold() {
        String input = "prime\n-5\n";
        String expectedOutput = "What type of number do you want to add up:\n" +
                "Enter threshold (exclusive)\n" +
                "0\n"; // Sum of prime numbers below a negative threshold should be 0

        assertEquals(expectedOutput, runMainWithInput(input));
    }

    private String runMainWithInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        After.main(new String[]{});

        return out.toString().replace("\r\n", "\n"); // Normalize line endings for consistency
    }
}
