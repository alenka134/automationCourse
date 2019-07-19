package com.automatization.training.bonus.logic2sorting;

public class Main1 {
    public static void main(String[] args) {
        //in your case for i-- it will print endless "*"
        //Correct version:
        int myArray[] = new int[20];
        int i;
        System.out.println("It will print only * and index in reverse order:");
        for (i = myArray.length ; i > 0; i--) {

            System.out.println("*" + i);
        }

        System.out.println("It will print only * and index in forward order:");
        for (i = 1; i <= myArray.length; i++) {

            System.out.println("*" + i);
        }
    }
}