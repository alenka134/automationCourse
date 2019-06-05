package com.automatization.training.methods3;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] numArray = new int[0];
        int number=0;
        while (number >=0) {
            System.out.println("Please, give ONLY positive number:");
            Scanner userInput = new Scanner(System.in);
            number = userInput.nextInt();

            if(number >=0) {
                int[] tempArray = numArray;

                numArray = new int[tempArray.length + 1];
                numArray[tempArray.length] = number;

                for (int i = 0; i < tempArray.length; i++) {
                    numArray[i] = tempArray[i];
                }
            }
            if (number <0) {
                System.out.println("Number is negative: " + number + "--> so we finish with entering of your numbers and continue with calculations");
            }
        }

        System.out.println(Arrays.toString(numArray));
        System.out.println("\nMin number is: " + getMinValue(numArray) + " and Max number is: " + getMaxValue(numArray));
        System.out.println("Average: " + average(numArray));
        System.out.println("Sum: " + sum(numArray));

        int newNumber = 0;
        while ((newNumber != -1)) {
            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = newNumber;
            }
        }
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / 5;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int getMinValue(int[] array) {

        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int getMaxValue(int[] array) {

        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}


