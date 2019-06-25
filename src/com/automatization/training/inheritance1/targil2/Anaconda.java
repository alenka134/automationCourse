package com.automatization.training.inheritance1.targil2;

public class Anaconda extends Snakes {
    @Override
    public void howDoYouLive() {
        System.out.println("I am anaconda: ");
        super.howDoYouLive();
    }
    public void howManyLegs() {
        super.howManyLegs();
        System.out.print("and Anaconda has no legs\n");
    }
}
