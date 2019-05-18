package com.automatization.training.loops2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        int input;
        String outPutText = "Enter your number: ";
        System.out.println(outPutText);
        Scanner num = new Scanner(System.in);
        while ((input = num.nextInt()) != -1) {
            System.out.println("number: " + input);

            if (input % 2 == 0) {
                System.out.println("This number is even: " + input);
                System.out.println(outPutText);
            }
            if (input % 2 != 0) {
                System.out.println("This number is odd: " + input);
                System.out.println(outPutText);
            }
        }
        if (input == -1) {
            System.out.println("Number: " + input + "--> end program");
        }
    }
}

