package com.automatization.training.composition2.targil1;

public class Main {
    public static void main(String[] args) {

        Beard beard = new Beard("grey", 10);
        Tail tail = new Tail(10);
        Leg[] legs = new Leg[4];

        legs[0] = new Leg(45, "white");
        legs[1] = new Leg(45, "white");
        legs[2] = new Leg(48, "black");
        legs[3] = new Leg(48, "black");
        Goat taish1 = new Goat(3, 45.5, "white", beard, legs[1], tail);
        Goat taish2 = new Goat(2, 35.5, "black", beard, legs[3], tail);

        taish1.printGoat();
        taish2.printGoat();

    }
}

