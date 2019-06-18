package com.automatization.training.composition3.targil1;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Wheel[] wheels = new Wheel[5];

        wheels[0] = new Wheel(34);
        wheels[1] = new Wheel(0);
        wheels[2] = new Wheel(31);
        wheels[3] = new Wheel(32);
        wheels[4] = new Wheel(29);

        Automobile auto = new Automobile("Toyota", "Corolla", 2011, wheels, radio);

        auto.printAutomobile();
        auto.printAirPressureInAllWheels();
        auto.getMinAirPressureAlert();
        auto.changePancher();
    }
}
