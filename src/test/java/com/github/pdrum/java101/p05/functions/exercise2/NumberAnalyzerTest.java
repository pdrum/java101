package com.github.pdrum.java101.p05.functions.exercise2;

import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    // Test 1: Normal case with multiple inputs
    @Test
    void testNormalCase() {
        String simulatedInput = "5\n3\n8\n1\n6\n4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        NumberAnalyzer.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Maximum value: 8"));
        assertTrue(output.contains("Minimum value: 1"));
        assertTrue(output.contains("Average value: 4.4"));
        assertTrue(output.contains("Number of even values: 3"));
    }

    // Test 2: Single input value (edge case)
    @Test
    void testSingleInput() {
        String simulatedInput = "1\n7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        NumberAnalyzer.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Maximum value: 7"));
        assertTrue(output.contains("Minimum value: 7"));
        assertTrue(output.contains("Average value: 7.0"));
        assertTrue(output.contains("Number of even values: 0"));
    }

    // Test 3: All even numbers
    @Test
    void testAllEvenNumbers() {
        String simulatedInput = "4\n2\n4\n6\n8\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        NumberAnalyzer.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Maximum value: 8"));
        assertTrue(output.contains("Minimum value: 2"));
        assertTrue(output.contains("Average value: 5.0"));
        assertTrue(output.contains("Number of even values: 4"));
    }

    // Test 4: Mixed positive and negative numbers
    @Test
    void testMixedPositiveAndNegativeNumbers() {
        String simulatedInput = "5\n3\n-7\n5\n-2\n8\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        NumberAnalyzer.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Maximum value: 8"));
        assertTrue(output.contains("Minimum value: -7"));
        assertTrue(output.contains("Average value: 1.4"));
        assertTrue(output.contains("Number of even values: 2"));
    }

    // Test 5: All negative numbers
    @Test
    void testAllNegativeNumbers() {
        String simulatedInput = "4\n-3\n-5\n-7\n-2\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        NumberAnalyzer.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Maximum value: -2"));
        assertTrue(output.contains("Minimum value: -7"));
        assertTrue(output.contains("Average value: -4.25"));
        assertTrue(output.contains("Number of even values: 1"));
    }
}
