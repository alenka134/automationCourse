package com.automatization.training.summarizes.targil1;

import java.util.ArrayList;

public class Main {


    public static void printShapes(ArrayList<Shape> shapes) {
        for (Shape s : shapes) {
            s.printData();
        }
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        ArrayList<Shape> listOfShapes = new ArrayList<>();

        boolean doExit = false;

        while (doExit == false) {
            //Main menu
            int choiceMenu = Menu.showMainMenu();
            CreateShape createShape = new CreateShape();
            System.out.println("User selected " + choiceMenu);
            switch (choiceMenu) {
                case 11:
                    //add a Square
                    Square square = createShape.addSquare();
                    if (square != null) {
                        listOfShapes.add(square);
                    }
                    break;
                case 12:
                    //add a Circle
                    Circle circle = createShape.addCircle();
                    if (circle != null) {
                        listOfShapes.add(circle);
                    }
                    break;
                case 13:
                    //add a Right Triangle
                    RightTriangle rightTriangle = createShape.addRightTriangle();
                    if (rightTriangle != null) {
                        listOfShapes.add(rightTriangle);
                    }
                    break;
                case 14:
                    //add a Rectangle
                    Rectangle rectangle = createShape.addRectangle();
                    if (rectangle != null) {
                        listOfShapes.add(rectangle);
                    }
                    break;

                case 2:
                    //print all shapes
                    printShapes(listOfShapes);
                    break;
                case 3:
                    //print sum all perimeters and sum all areas
                    break;
                case 4:
                    //print biggest perimeter and biggest area
                    break;
                case 5:
                    doExit = true;
                    break;
            }
        }
        System.out.println("End program");
    }
}

