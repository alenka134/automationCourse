package com.automatization.training.summarizes.targil1;

public class ChooseShape {

    private CreateShape createShape = new CreateShape();

    public Shape getShape(int numberShape) {

        switch (numberShape) {
            case 11:
                return createShape.addSquare();
            case 12:
                return createShape.addCircle();
            case 13:
                return createShape.addRightTriangle();
            case 14:
                return createShape.addRectangle();
            default:
                return null;
        }
    }

}