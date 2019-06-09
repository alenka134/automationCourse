package com.automatization.training.classes1.targil3;

public class Rectangle {
    private double area;
    private String color;

    public Rectangle(double area, String color){
        this.area = area;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void printRectangle(){
        System.out.println("Rectangle area is: " + getArea() + " and color: " + getColor());
    }
}
