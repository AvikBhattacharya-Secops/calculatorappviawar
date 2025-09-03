package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMul() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() {
        calc.divide(5, 0);
    }
}