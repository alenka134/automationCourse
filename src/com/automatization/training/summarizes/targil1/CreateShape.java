package com.automatization.training.summarizes.targil1;

import java.util.Scanner;

public class CreateShape {

    private Scanner scanner = new Scanner(System.in);

    public Square addSquare() {

        System.out.println("Enter the one side of the square: ");
        int width = scanner.nextInt();
        if (width > 0) {
            Square square = new Square(width);
            return square;
        } else {
            return null;
        }
    }

    public Circle addCircle() {

        System.out.println("Enter the radius of the circle: ");

        int radius = scanner.nextInt();
        if (radius > 0) {
            Circle circle = new Circle(radius);

            circle.calcPerimeter();
            circle.calcArea();

            return circle;
        } else {
            return null;
        }
    }

    public RightTriangle addRightTriangle() {

        System.out.println("Enter the 1st height of the right triangle: ");
        int height1 = scanner.nextInt();
        System.out.println("Enter the 2nd height of the right triangle: ");
        int height2 = scanner.nextInt();
        if (height1 > 0 && height2 > 0) {
            RightTriangle rightTriangle = new RightTriangle(height1, height2);
            return rightTriangle;
        } else {
            return null;
        }
    }

    public Rectangle addRectangle() {

        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        if (width > 0 && length > 0) {
            Rectangle rectangle = new Rectangle(width, length);
            return rectangle;
        } else {
            return null;
        }
    }

}
