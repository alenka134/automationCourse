package com.automatization.training.classes2.targil1;

public class Circle {
    private String color;
    private int radius;
    private double area;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        area = 3.14 * radius * radius;
        return area;
    }

    public void printCircle() {
        System.out.println("Circle area is: " + getArea() + " and color is " + getColor());
    }
}
