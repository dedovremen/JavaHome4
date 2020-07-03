package com.company.MyClasses;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcArea() {
        double area = length * width;
        return area;
    }

    public double calcPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
