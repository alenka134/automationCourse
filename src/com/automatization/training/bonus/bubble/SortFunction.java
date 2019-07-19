package com.automatization.training.bonus.bubble;

public class SortFunction {

    public static int[] sortArrayAscending(int[] arrInput) {
        int[] arrOut;
        //Sort
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arrInput.length - 1; i++) {
                //check if need swap
                if (arrInput[i] > arrInput[i + 1]) {
                    int temp = 0;
                    temp = arrInput[i];
                    arrInput[i] = arrInput[i + 1];
                    arrInput[i + 1] = temp;
                    swap = true;
                }
            }
        }
        arrOut = arrInput;
        return arrOut;
    }

    public static int[] sortArrayDescending(int[] arrInput) {
        int[] arrOut;
        //Sort
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arrInput.length - 1; i++) {
                //check if need swap
                if (arrInput[i] < arrInput[i + 1]) {
                    int temp = 0;
                    temp = arrInput[i];
                    arrInput[i] = arrInput[i + 1];
                    arrInput[i + 1] = temp;
                    swap = true;
                }
            }
        }
        arrOut = arrInput;
        return arrOut;
    }
}
