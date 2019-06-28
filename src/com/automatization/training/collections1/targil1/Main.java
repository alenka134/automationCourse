package com.automatization.training.collections1.targil1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfCountries = new ArrayList<>();

        listOfCountries.add("Israel");
        listOfCountries.add("USA");
        listOfCountries.add("Japan");
        listOfCountries.add("Mexico");
        listOfCountries.add("Australia");

        System.out.println("Before Sorting:\n");

        for (String countries : listOfCountries) {
            System.out.println("Country: " + countries);
        }

        Collections.sort(listOfCountries);

        System.out.println("\nAfter Sorting:\n");
        for (String counter : listOfCountries) {
            System.out.println("Country: " + counter);
        }
    }
}
