package com.automatization.training.composition3.targil1;

public class Automobile {
    private String brand;
    private String model;
    private int year;
    private Wheel[] wheels;
    private Radio radio;

    public Automobile(String brand, String model, int year, Wheel[] wheels, Radio radio) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.radio = radio;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printAutomobile() {
        System.out.println("The auto is: " + getBrand() + " " + getModel() + ", " + getYear());
        System.out.println();
    }

    //Method for Radio switch ON
    public void turnONRadion() {
        radio.setSwitchStatus(true);
    }

    //Method for Radio switch OFF
    public void turnOFFRadion() {
        radio.setSwitchStatus(false);
    }

    //Method returns Radio status
    public boolean getRadioState() {
        return radio.isSwitchStatus();
    }

    //Method returns name of the Radio Station
    public String getRadioStation() {
        if (radio.isSwitchStatus() == true) {
            return radio.getCurrentStation().getNameStation();
        }
        return "Radio is turn OFF";
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void printAirPressureInAllWheels() {
        for (int i = 0; i < this.wheels.length; i++) {
            System.out.println("Number of the wheel is " + (i + 1) + " air pressure inside is: " + wheels[i].getActualAirPressure());
        }
    }

    public void getMinAirPressureAlert() {
        boolean puncher = false;
        for (int i = 0; i < this.wheels.length; i++) {
            if (wheels[i].getActualAirPressure() < 25.0) {
                puncher = true;
                System.out.println("\nAlert message: Low air pressure in the wheel is: " + (i + 1) + " air pressure inside is: " + wheels[i].getActualAirPressure());
            }
        }

        if (puncher == false) {
            System.out.println("All air pressure in the wheels are good enough");
        }
    }

    public void changePancher() {

        for (int i = 0; i < this.wheels.length; i++) {
            if (wheels[i].getActualAirPressure() == 0.0) {

               // System.out.println("\nAir pressure in the wheel: " + (i + 1) + " is zero. You have to change it on spare wheel: " + (wheels.length));
                System.out.println("You have to change the wheel number # " + (i + 1) + " to spare wheel ");
            }
        }
        if (wheels[4].getActualAirPressure() == 0.0) {
            System.out.println("In the spare wheel must pump air ");
        }
    }
}