package com.automatization.training.classes1.targil1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(5, "Bandit", "white & grey");
        Cat cat2 = new Cat(4, "Duchess", "white & black");

        System.out.println("My 1st cat is " + cat1.getName() + ". He has color: " + cat1.getColor());
        System.out.println("My 2nd cat is " + cat2.getName() + ". She has color: " + cat2.getColor());

    }
}
