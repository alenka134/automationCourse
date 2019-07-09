package com.automatization.training.summarizes.targil1;

public class RightTriangle extends Shape {
    private double height1;
    private double height2;
    private double height3;

    public void printData() {
        System.out.println("Right Triangle: height1 = " + getHeight1() + " and height2 + " + getHeight2());
        System.out.println("Right Triangle perimeter is: " + calcPerimeter() + " and area is: " + calcArea());
    }
    public double calcPerimeter() {
        return getHeight1() + getHeight2() + getHeight3();

    }
    public double calcArea() {
        return height1 * height2 / 2;
    }

    public RightTriangle(double height1, double height2) {
        super();
        this.height1 = height1;
        this.height2 = height2;
        this.height3 = (height1 * height1) + (height2 * height2);
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }

    public double getHeight2() {
        return height2;
    }

    public void setHeight2(double height2) {
        this.height2 = height2;
    }

    public double getHeight3() {
        return height3;
    }

    public void setHeight3(double height3) {
        this.height3 = height3;
    }

}
