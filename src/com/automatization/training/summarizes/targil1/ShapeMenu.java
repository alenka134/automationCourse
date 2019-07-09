package com.automatization.training.summarizes.targil1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMenu {

    public void showShapesMenu() {

        List<Shape> shapeList = new ArrayList<>();
        while (true) {

            System.out.println("\tType 1 to add a square");
            System.out.println("\tType 2 to add a circle");
            System.out.println("\tType 3 to add a right triangle");
            System.out.println("\tType 4 to add a rectangle");
            System.out.println("\tType 5 to return to main menu");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice >= 1 && choice < 5) {

                Shape shape = getShape(choice);

                if (shape != null) {
                    shapeList.add(shape);
                }
            }
            else if (choice >=5){
                return;
            }
            //If user typed something out of range 1-5
            // shapes will be printed again and again
            System.out.println("\t===========================");
        }
    }


    private Shape getShape(int choice) {
        CreateShape createShape = new CreateShape();
        switch (choice) {
            case 1:
                return createShape.addSquare();
            case 2:
                return createShape.addCircle();
            case 3:
                return createShape.addRightTriangle();
            case 4:
                return createShape.addRectangle();
            default:
                return null;
        }

    }
}