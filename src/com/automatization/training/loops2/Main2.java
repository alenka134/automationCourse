package com.automatization.training.loops2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int input;

        System.out.println("Enter your age: ");
        Scanner age = new Scanner(System.in);

        while ((input = age.nextInt()) != -1) {
            System.out.println("He is adult, age is: " + input);
            System.out.println("\nEnter your age: ");

            if (input > 66) {
                System.out.println("He is pensioner, age is: " + input);
                System.out.println("\nEnter your age: ");
            }

            if (input < 18) {
                System.out.println("He is a child, age is: " + input);
                System.out.println("\nEnter your age: ");
            }
        }
        if (input == -1) {
            System.out.println("Age: " + input + "--> end program");
        }
    }
}
