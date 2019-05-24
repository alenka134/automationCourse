package com.automatization.training.arrays2;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {3, 56, 89, 90, 100, 78};

        System.out.println("Original array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n___________________");
        System.out.println("\nArray in reverse order: ");

        for (int i = numbers.length - 1; i >= 0; i--)
            System.out.print(numbers[i] + " ");
    }

}
