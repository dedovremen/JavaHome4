package com.company.MyClasses;

public class Square {
    private double sideLength;

    public Square(double sideLenght) {
        this.sideLength = sideLenght;
    }

    public double calcArea(){
        double area = sideLength * sideLength;

        return area;

    }

    public double calcPerimeter() {
        double perimeter = 4 * sideLength;
        return perimeter;
    }
}
