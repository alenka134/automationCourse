package com.automatization.training.loops2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int input;

        System.out.println("Enter your number: ");
        Scanner number = new Scanner(System.in);

        while ((input = number.nextInt()) != 0) {

            if (input * input > 30) {
                System.out.println("Your number is: " + input + "\nand your calculated number is: " + input * input);
                System.out.println("\nEnter your next number: ");
            }
            if (input * input < 30) {
                System.out.println("I can not print your calculated number, because it less then 30");
                //   System.out.println("I can not print the calcN, because Your number is: " + input+ "\nand your calculated number is: " + input*input);
                System.out.println("\nEnter your next number: ");
            }
        }
        if (input == 0) {
            System.out.println("Number: " + input + "--> end program");
        }
    }
}
