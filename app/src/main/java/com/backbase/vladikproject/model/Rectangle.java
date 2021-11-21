package com.backbase.vladikproject.model;

public class Rectangle {

    private int sideA;
    private int sideB;

    public Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    public int calculatePerimeter() {
        int perimeter = (sideA + sideB) * 2;
        return perimeter;
    }
}