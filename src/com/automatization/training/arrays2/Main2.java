package com.automatization.training.arrays2;

public class Main2 {
    public static void main(String[] args) {
        String[] studentNames = {"Sheila", "Lucy", "Alex", "Jon", "Berk"};
        int[] studentBalls = {78, 88, 76, 99, 95};

        int highest = studentBalls[0];

        for (int i = 0; i < studentBalls.length; i++) {

            if (studentBalls[i] > highest) {
                highest = studentBalls[i];

            }
        }

        for (int x = 0; x < studentNames.length; x++) {

            if (studentBalls[x] == highest) {
                System.out.println("The highest ball in the group is: " + highest + "\nStudent name is: " + studentNames[x]);


            }
        }
    }
}