package com.automatization.training.inheritance1.targil2;

public class Mammals extends Animal {
    @Override
    public void howManyLegs() {
        super.howManyLegs();
        System.out.println("Class Mammals have 4 legs");
    }
}
