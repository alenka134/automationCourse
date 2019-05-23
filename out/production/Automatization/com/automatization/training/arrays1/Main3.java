package com.automatization.training.arrays1;

public class Main3 {
    public static void main(String[] args) {
        double[] numbers = {45.8, 89.5, 100.56, 78.90, 23.7};
        double sumTotal = 0;

     /*first option:

        for (int i = 0; i < numbers.length; i++) {
            sumTotal = sumTotal + numbers[i];
        }
       2nd option: */

        for (double anArray : numbers) {
            sumTotal = sumTotal + anArray;
        }
        System.out.println("Total summary of the numbers: "+ sumTotal);
    }
}