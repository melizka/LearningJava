package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    Math math = new Math();

    @Test
    public void multiply() {

        int result = Math.multiply(2,7);
        assertEquals(14, result, "2 * 7 має бути 14");
    }

    @Test
    public void substract() {

        int result = Math.substract(6,2);
        assertEquals(4,result, "6 - 2 має бути 4");
    }
}
