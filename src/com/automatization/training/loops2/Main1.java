package com.automatization.training.loops2;

import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {

        int input;

        System.out.println("Enter your age: ");
        Scanner age = new Scanner(System.in);

        while ((input = age.nextInt()) != -1) {
            System.out.println("age: " + input);
            input++;
            System.out.println("Enter your age: ");
        }

        if (input == -1) {

            System.out.println("Age: " + input + "--> end program");
        }
    }
}




