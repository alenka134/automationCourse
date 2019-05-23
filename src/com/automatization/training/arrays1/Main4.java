package com.automatization.training.arrays1;

public class Main4 {
    public static void main(String[] args) {
        double[] numbers = {45.8, 89.5, 100.56, 78.90, 23.7};

        double smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }
        System.out.println(smallest);
    }
}