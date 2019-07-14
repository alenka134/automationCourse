package com.automatization.training.hashmap1.targil1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Creating map of countries
        Map<String, Country> mapCountry = new HashMap<>();

        Country usa = new Country("United State", "Washington", 1);
        Country uk = new Country("United Kingdom", "London", 44);
        Country il = new Country("Israel", "Jerusalem", 972);
        Country ru = new Country("Russia", "Moscow", 7);

        mapCountry.put("United States", usa);
        mapCountry.put("United Kingdom", uk);
        mapCountry.put("Israel", il);
        mapCountry.put("Russia", ru);

        for (Map.Entry<String, Country> entry : mapCountry.entrySet()) {
            String key = entry.getKey();
            Country country = entry.getValue();

            System.out.println("\n" + key + " Details: \n=====================");
            System.out.println(country.getCountryName() + " , " + country.getCapitalName() + " , " + country.getAreaCode());
        }

    }
}
