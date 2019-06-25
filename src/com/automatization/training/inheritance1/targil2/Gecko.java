package com.automatization.training.inheritance1.targil2;

public class Gecko extends Lizards {
    @Override
    public void howManyLegs() {
        super.howManyLegs();
        System.out.println(" and Gecko also has 4 legs\n");
    }
}
