package com.automatization.training.composition2.targil1;

public class Leg {
    private int lenghtLeg;
    private String colorLeg;

    public Leg(int lenghtLeg, String colorLeg) {
        this.lenghtLeg = lenghtLeg;
        this.colorLeg = colorLeg;
    }

    public int getLenghtLeg() {
        return lenghtLeg;
    }

    public void setLenghtLeg(int lenghtLeg) {
        this.lenghtLeg = lenghtLeg;
    }

    public String getColorLeg() {
        return colorLeg;
    }

    public void setColorLeg(String colorLeg) {
        this.colorLeg = colorLeg;
    }
}
