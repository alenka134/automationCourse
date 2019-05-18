package com.automatization.training.conditions1;

import java.util.Scanner;

public class Main3_5 {
    public static void main(String[] args) {

        Scanner readme = new Scanner(System. in);
        System. out. println("Enter your number: ");

        int num = readme.nextInt();
        System.out.println("Your number is: " + num);

        if (num % 2 == 0){
            System.out.println("This number is even");
        }
        else {
            System.out.println("This number is odd");
        }
    }
}
