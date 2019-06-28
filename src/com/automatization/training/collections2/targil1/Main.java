package com.automatization.training.collections2.targil1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();

        hmap.put("England", "London");
        hmap.put("Israel", "Jerusalem");
        hmap.put("Germany", "Berlin");
        hmap.put("Norway", "Oslo");
        hmap.put("USA", "Washington DC");
       // System.out.println(hmap);
        System.out.println("Capital City of Israel is: " + hmap.get("Israel"));
    }
}