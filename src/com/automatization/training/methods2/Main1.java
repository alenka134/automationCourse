package com.automatization.training.methods2;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(returnMinValue(25, 90, 6));
    }

    public static int returnMinValue(int a, int b, int c) {
        int minNum;
        if (a < b && b < c) {
            minNum = a;

            if (b < a && a < c)
                minNum = b;

        } else minNum = c;
        return minNum;
    }
}
