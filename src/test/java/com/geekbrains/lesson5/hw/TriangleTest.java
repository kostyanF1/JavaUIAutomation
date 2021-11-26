package com.geekbrains.lesson5.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.geekbrains.lesson5.Triangle.calculateTriangleSquare;

public class TriangleTest {
    @Test
    void positiveSquareCalcTest () throws Exception {
        double result = calculateTriangleSquare(2, 2, 2);
        Assertions.assertEquals(1.7320508075688772, result);
    }

    @Test
    void negativeTriangleTest () {
        Assertions.assertThrows(Exception.class, () -> calculateTriangleSquare(-2, 2, 2));
    }
}
