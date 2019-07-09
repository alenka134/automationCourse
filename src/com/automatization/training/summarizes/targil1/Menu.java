package com.automatization.training.summarizes.targil1;

import java.util.Scanner;

public class Menu {

    public static int showMainMenu() {
        //Loop which will always run
        while (true) {

            System.out.println("Type 1 to add a shape");
            System.out.println("Type 2 to print all the shapes");
            System.out.println("Type 3 to print Sum of all perimeters and Sum of all areas");
            System.out.println("Type 4 to print the biggest perimeter and the biggest area");
            System.out.println("Type 5 to exit");
            System.out.println("==============================");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //process sub menu for different shapes
                    int subMenuChoice = showShapesMenu();
                    switch (subMenuChoice)
                    {
                        case 1:
                            return 11;
                        case 2:
                            return 12;
                        case 3:
                            return 13;
                        case 4:
                            return 14;
                    }
                    break;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
            }
        }
    }

    public static int showShapesMenu() {
        while (true) {

            System.out.println("\tType 1 to add a square");
            System.out.println("\tType 2 to add a circle");
            System.out.println("\tType 3 to add a right triangle");
            System.out.println("\tType 4 to add a rectangle");
            System.out.println("\tType 5 to return to main menu");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= 5)
                return choice;

            //If user typed something out of range 1-5
            // shapes will be printed again and again
            System.out.println("\t===========================");
        }
    }
}


//Sum all circumferences
//Sum all areas
//Find biggest circumference
//Find biggest area
//Exit