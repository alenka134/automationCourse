package com.automatization.training.inheritance1.targil2;

public class Main {
    public static void main(String[] args) {
        Anaconda anaconda = new Anaconda();
        Gorilla gorilla = new Gorilla();
        Capuchin capuchin = new Capuchin();
        Gecko gecko = new Gecko();

        anaconda.howDoYouLive();
        anaconda.howManyLegs();
        gorilla.howManyLegs();
        capuchin.howManyLegs();
        gecko.howManyLegs();
    }
}
