package com.automatization.training.methods1;

public class Main3 {
    public static void main(String[] args) {

        System.out.println(calcValue(4)+ " - is my calculated value");
    }

    public static int calcValue(int myValue) {

        int x = myValue + 5;  //myValue += 5;
        return x;            //return myValue;
    }
}
