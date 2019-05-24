package com.automatization.training.arrays3manualExam;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10};
        int biggest = 0;
        int secondBiggest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest) {
                secondBiggest = biggest;
                biggest = arr[i];

            } else if (arr[i] > secondBiggest){
                secondBiggest = arr[i];
            }
        }
        System.out.println("The second largest element is: " + secondBiggest);
    }
}
