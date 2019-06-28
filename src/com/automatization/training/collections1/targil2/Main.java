package com.automatization.training.collections1.targil2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(13);
        listNumbers.add(77);
        listNumbers.add(6);
        listNumbers.add(999);
        listNumbers.add(55);

        System.out.println("\nList numbers are:" + listNumbers);
        System.out.println("Max number is: " + Collections.max(listNumbers));
        System.out.println("Min number is: " + Collections.min(listNumbers));
    }
}