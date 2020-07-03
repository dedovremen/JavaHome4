package com.company.MyClasses;

public class Circle {
    private double diameter;


    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double calcArea() {
        double area = Math.PI * Math.pow(diameter / 2, 2);
        return area;
    }

    public double calcCircumference() {
        double circumference = 2 * Math.PI * (diameter/2);

        return circumference;
    }
}

