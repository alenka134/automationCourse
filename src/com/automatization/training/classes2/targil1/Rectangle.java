package com.automatization.training.classes2.targil1;

public class Rectangle {
    private String color;
    private int height;
    private int width;
    private double area;

    public Rectangle(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea() {
        area = height * width;
        return area;
    }

    public void printRectangle() {
        System.out.println("Rectangle area is: " + getArea() + " and color is " + getColor());
    }
}
