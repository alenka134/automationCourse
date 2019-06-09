package com.automatization.training.garbage;

import java.util.Arrays;
import java.util.Scanner;

public class Main2a {
    public static void main(String[] args) {

        System.out.println("Enter 5 integers:");
        Scanner numbers = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Min number is: " + getMinValue(arr) + " and Max number is: " + getMaxValue(arr));
        System.out.println("Average: " + average(arr));
        System.out.println("Sum: " + sum(arr));
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