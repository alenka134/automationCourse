package com.automatization.training.methods3;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        Integer[] array1 = {454, 8787, 86876, 7676, 87878, 99, 444, 433, 222, 9999};
        Integer[] array2 = {454, 8787, 86876, 7676, 87878, 99, 444, 433, 2225, 9999};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        equals(array1, array2);

    }

    public static boolean equals(Integer[] array1, Integer[] array2) {
        if (Arrays.equals(array1, array2))
            System.out.println("Two arrays are same");
        else
            System.out.println("Two arrays are not same");
        return false;
    }
}

