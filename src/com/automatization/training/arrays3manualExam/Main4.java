package com.automatization.training.arrays3manualExam;

import java.lang.*;

public class Main4 {
    public static void main(String[] args) {

        String input = "example";
        //getBytes() method to convert string into bytes[]
        byte[] stringAsByteArray = input.getBytes();

        byte[] result = new byte[stringAsByteArray.length];

        //Store result in reverse order into the result byte[]
        for (int i = 0; i < stringAsByteArray.length; i++)

            result[i] = stringAsByteArray[stringAsByteArray.length- i -1];

        System.out.println(new String(result));


    }
}
