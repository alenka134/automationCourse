package com.automatization.training.arrays1;

public class Main5 {
    public static void main(String[] args)
    {
       double numbers[] = {45.8, 89.5, 100.56, 78.90, 23.7};
        double total = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            total = total + numbers[i];
        }

        double average = total / numbers.length;

        System.out.println("The total is : " + total);
        System.out.println("Average of array : " + average);
    }

}
