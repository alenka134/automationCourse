package com.automatization.training.inheritance1.targil2;

public class Lizards extends Reptiles {
    @Override
    public void howManyLegs() {
        super.howManyLegs();
        super.printReptilesLegs();
        System.out.print("All the lizards has 4 legs");
    }
}
