package com.automatization.training.collections2.targil2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int array[] = {88, 2, 300, 4, 5, 66, 99, 6575, 6565, 21};
        arrayToArrayList(array);
    }

    public static void arrayToArrayList(int arr[]) {
        ArrayList<Integer> array_list = new ArrayList<>();

        // Using add() method to add elements in array_list
        for (int i = 0; i < arr.length; i++)
            array_list.add(new Integer(arr[i]));
        System.out.print("Print array list---> " + array_list);

        Collections.sort(array_list);

        System.out.println("\nAfter Sorting:");
        for (Integer sorted_array_list : array_list) {
            System.out.print(sorted_array_list + ", ");
        }
    }
}

