package com.automatization.training.classes1.targil2;

public class Main {
    public static void main(String[] args) {
        Cat[] myCats = new Cat[5];
        myCats[0] = new Cat(3, "Snoopi", "black");
        myCats[1] = new Cat(4, "Mitzi", "white" );
        myCats[2] = new Cat(5, "Bandit", "white & grey");
        myCats[3] = new Cat(5, "Duchess", "white & black");
        myCats[4] = new Cat(2,"Dolchi", "brindle");

        for (int i = 0; i < myCats.length; i++) {
            myCats[i].print();
        }
    }
}
