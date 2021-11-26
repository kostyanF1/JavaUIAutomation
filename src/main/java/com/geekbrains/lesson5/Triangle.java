package com.geekbrains.lesson5;

public class Triangle {
    public static double calculateTriangleSquare (double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) throw new Exception();
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
