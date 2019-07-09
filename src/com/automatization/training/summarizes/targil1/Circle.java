package com.automatization.training.summarizes.targil1;

public class Circle extends Shape {
    private double radius;

    //implement abstract method from parent
    public void printData() {
        System.out.println("Circle: radius = "+ getRadius());
        System.out.println("Circle perimeter is: " + calcPerimeter() + " and area is: " + calcArea());
    }

    //implement abstract method from parent
    public double calcPerimeter() {
        return radius * 2 * 3.14;
    }

    //implement abstract method from parent
    public double calcArea() {
        return radius * radius * 3.14;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
