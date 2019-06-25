package com.automatization.training.inheritance1.targil2;

public class Capuchin extends Monkeys {
    @Override
    public void howManyLegs() {
       // super.howManyLegs();
        super.printMonkeyLegs();
        System.out.println(" and Capuchin has 4 legs\n");
    }
}
