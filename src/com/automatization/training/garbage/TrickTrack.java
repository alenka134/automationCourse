package com.automatization.training.garbage;

import com.automatization.training.composition3.targil1.Wheel;

import java.lang.reflect.Array;

public class TrickTrack {

    public static void main(String[] args) {
        Wheel[] wheels = new Wheel[5];
        wheels[0] = new Wheel(34);
        wheels[1] = new Wheel(3);
        wheels[2] = new Wheel(31);
        wheels[3] = new Wheel(32);
        wheels[4] = new Wheel(29);

        for (int i = 0; i < wheels.length; i++) {
            System.out.println("Number of the wheel is " + (i + 1) + " air pressure inside is: " + wheels[i].getActualAirPressure());
            {
                if (wheels[i].getActualAirPressure() < 10.0) {
                    Wheel pancherWheel=wheels[i];
                    wheels[i] = wheels[4];
                    wheels[4] = pancherWheel ;


                    System.out.println("You have to change the wheel number # " + (i + 1) + " to spare wheel # " + wheels.length);

                    System.out.println("Number of the wheel is " + (i + 1) + " air pressure inside is: " + wheels[i].getActualAirPressure());

                }
                // System.out.println("Number of the wheel is " + (i + 1) + " air pressure inside is: " + wheels[i].getActualAirPressure());
            }

           if (wheels[4].getActualAirPressure() == 0.0) {
                System.out.println("In the spare wheel must pump air ");
            }
        }
    }
}