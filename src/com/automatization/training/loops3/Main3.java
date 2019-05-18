package com.automatization.training.loops3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        String string1 = "Firefox";
        String string2 = "Chrome";
        String string3 = "IE";
        String string4 = "other";

        Scanner scan = new Scanner(System.in);
        System.out.println("Input one from browsers from the list: FireFox, Chrome, IE or other: ");
        String str = scan.nextLine();


        if (str.length() == string1.length()){
            System.out.println("blue");
        }
        if (str.length() == string2.length()) {
            System.out.println("red");
        }
        if (str.length() == string3.length()) {
            System.out.println("yellow");
        }
        if (str.length() == string4.length()) {
            System.out.println("green");
        }
    }
}
