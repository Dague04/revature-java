package com.company.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int actualRes = calculator.add(4,6);
        assertEquals(10, actualRes);
    }

    @Test
    void substract() {
        int actualRes = calculator.substract(4,6);
        assertEquals(-2, actualRes);
    }

    @Test
    void multiply() {
        int actualRes = calculator.multiply(4,3);
        assertEquals(12, actualRes);
    }

    @Test
    void divide() {
        double actualRes = calculator.divide(20,2);
        assertEquals(10, actualRes);
    }

    @Test
    void divideThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0));
    }
}