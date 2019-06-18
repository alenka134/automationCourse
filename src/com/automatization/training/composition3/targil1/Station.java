package com.automatization.training.composition3.targil1;

public class Station {
    private String nameStation;
    private double frequency;

    public Station(String nameStation, double frequency) {
        this.nameStation = nameStation;
        this.frequency = frequency;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setRadioStation(String nameStation) {
        this.nameStation = nameStation;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

}

