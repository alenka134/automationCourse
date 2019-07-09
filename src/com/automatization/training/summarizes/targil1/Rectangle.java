package com.automatization.training.summarizes.targil1;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public void printData() {
        System.out.println("Rectangle: width = " + getWidth() + " and length: " + getLength());
        System.out.println("Rectangle perimeter is: " + calcPerimeter() + " and area is: " + calcArea());
    }
    public double calcPerimeter() {
        return width * length * 2;
    }

    public double calcArea() {
        return width * length;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
