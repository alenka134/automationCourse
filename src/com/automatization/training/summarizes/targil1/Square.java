package com.automatization.training.summarizes.targil1;

public class Square extends Shape {
    private double width;

    public void printData() {
        System.out.println("Square: width = " + getWidth());
        System.out.println("Square perimeter is: " + calcPerimeter() + " and area is: " + calcArea());
    }
    public double calcPerimeter() {
        return width * 4;
    }

    public double calcArea() {
        return width * width;
    }

    public Square(double width){
        super();
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
