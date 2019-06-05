package com.automatization.training.methods2;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

       Integer[] array1 = {454, 8787, 86876, 7676, 87878, 99, 444, 433, 222, 9999};
        int myValue = 86876;

        System.out.println("Array: " + Arrays.toString(array1));
        searchValue(myValue, array1);
    }

    private static boolean searchValue(int myValue, Integer[] array1) {
        boolean test = Arrays.asList(array1).contains(myValue);

        System.out.println("Is your value " + myValue + " present in the array? Tne answer is: " + test);
        return test;
    }
}
