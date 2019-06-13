package com.automatization.training.composition2.targil1;

public class Goat {
    private int age;
    private double weight;
    private String colorGoat;
    private Beard beard;
    private Legs legs;
    private Tail tail;


    public Goat(int age, double weight, String colorGoat, Beard beard, Legs legs, Tail tail) {
        this.age = age;
        this.weight = weight;
        this.colorGoat = colorGoat;
        this.beard = beard;
        this.legs = legs;
        this.tail = tail;
    }

    public String getColorGoat() {
        return colorGoat;
    }

    public void setColorGoat(String colorGoat) {
        this.colorGoat = colorGoat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Beard getBeard() {
        return beard;
    }

    public void setBeard(Beard beard) {
        this.beard = beard;
    }

    public Legs getLegs() {
        return legs;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }
public void printGoat(){
    System.out.println("The goat is " +getAge() + " years old , his color is " + getColorGoat() + " and weight: " + getWeight() + "kg");
    System.out.println("This goat also has " + legs.getLenghtLegs() + "cm long legs, painted " + legs.getColorLegs()+ ", a long beard: " + beard.getLengthBeard() + "cm, painted " + beard.getColorBeard() +" and long tail: "+ tail.getLengthTail() + "cm\n");
}
}

