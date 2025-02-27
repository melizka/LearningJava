package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        // Тестуємо додавання
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 має бути 5");
    }

    @Test
    public void testSubtract() {
        // Тестуємо віднімання
        int result = calculator.subtract(5, 2);
        assertEquals(3, result, "5 - 2 має бути 3");
    }
}
