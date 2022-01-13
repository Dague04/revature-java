package com.company.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestWithParameters {

    int num1;
    int num2;
    int sum;
    Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }


    @ParameterizedTest
    public static Collection values() {
        return Arrays.asList(new Object[][]{
                {1,3,4},
                {2,6,8},
                {3,4,7}
        });
    }

    @Test
    void add() {
        assertEquals(sum, calculator.add(num1,num2));
    }
}