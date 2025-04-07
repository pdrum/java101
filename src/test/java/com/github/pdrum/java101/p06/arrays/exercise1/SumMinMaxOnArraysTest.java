package com.github.pdrum.java101.p06.arrays.exercise1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumMinMaxOnArraysTest {

    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4', 10",
            "'-1,-2,-3,-4', -10",
            "'0,0,0,0', 0",
            "'5', 5",
            "'', 0"
    })
    @DisplayName("Test sum() function")
    void testSum(String input, int expected) {
        int[] numbers = parseInput(input);
        assertEquals(expected, SumMinMaxOnArrays.sum(numbers));
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4', 4",
            "'-1,-2,-3,-4', -1",
            "'0,0,0,0', 0",
            "'5', 5",
            "'10,20,30,40', 40"
    })
    @DisplayName("Test max() function")
    void testMax(String input, int expected) {
        int[] numbers = parseInput(input);
        assertEquals(expected, SumMinMaxOnArrays.max(numbers));
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4', 1",
            "'-1,-2,-3,-4', -4",
            "'0,0,0,0', 0",
            "'5', 5",
            "'10,20,30,40', 10"
    })
    @DisplayName("Test min() function")
    void testMin(String input, int expected) {
        int[] numbers = parseInput(input);
        assertEquals(expected, SumMinMaxOnArrays.min(numbers));
    }

    // Helper method to parse CSV input string to int[]
    private int[] parseInput(String input) {
        if (input.isEmpty()) return new int[]{};
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        return numbers;
    }
}
