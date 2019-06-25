package com.automatization.training.inheritance1.targil2;

public class Gorilla extends Monkeys {
    @Override
    public void howManyLegs() {
       // super.howManyLegs();
        super.printMonkeyLegs();
        System.out.print(" and Gorilla has 4 legs\n");
    }
}
