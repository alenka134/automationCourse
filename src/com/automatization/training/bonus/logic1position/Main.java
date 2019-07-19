package com.automatization.training.bonus.logic1position;

public class Main {
    public static void main(String[] args) {
        String S = "atddueeebbgg";
        char[] array = S.toCharArray();
        int count = 1;
        int position = 0;
        int max = 0;
        char maxChar = 0;

        for (int i = 1; i < array.length; i++) { // Start from 1 since we want to compare it with the char in index 0
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count > max) {  // Record current run length, is it the maximum?
                    max = count;
                    maxChar = array[i - 1];
                    position = i - count;
                }
                count = 1; // Reset the count
            }
        }
        if (count > max) {
            max = count; // This is to account for the last run
            maxChar = array[array.length - 1];
        }
        System.out.println("Longest run: " + max + ", for the character " + maxChar + ", position: " + position); // Print the maximum.
    }
}
