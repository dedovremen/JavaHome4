package com.company;

import com.company.MyClasses.Circle;
import com.company.MyClasses.Rectangle;
import com.company.MyClasses.Square;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(3, 7);

	System.out.println("Площадь круга = " + circle.calcArea() + "\n" + "Длина окружности = " + circle.calcCircumference());

	System.out.println("\n" + "Площадь квадрата = " + square.calcArea() + "\n" + "Периметр квадрата = " + square.calcPerimeter());

	System.out.println("\n" + "Площадь прямоугольника = " + rectangle.calcArea() + "\n" + "Периметр прямоугольника = " + rectangle.calcPerimeter());
    }
}
