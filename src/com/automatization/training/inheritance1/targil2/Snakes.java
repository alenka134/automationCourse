package com.automatization.training.inheritance1.targil2;

public class Snakes extends Reptiles {
    @Override
    public void howManyLegs() {
       // super.howManyLegs();
        super.printReptilesLegs();
        System.out.print("All snakes have not legs ");
    }
}
