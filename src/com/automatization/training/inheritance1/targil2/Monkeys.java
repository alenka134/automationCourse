package com.automatization.training.inheritance1.targil2;

public class Monkeys extends Mammals {
    @Override
    public void howManyLegs() {
        super.howManyLegs();
    }
    public void printMonkeyLegs() {
        System.out.print("\nAll the monkeys inside class Mammals have 4 legs");
    }
}
