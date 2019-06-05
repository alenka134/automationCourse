package com.automatization.training.methods2;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {13, 35, 2, 11, 33, 99, 8, 999, 67, 9999};

        System.out.println("The min element is: " + getMinValue(numbers));
    }

    public static int getMinValue(int[] numbers) {

        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
