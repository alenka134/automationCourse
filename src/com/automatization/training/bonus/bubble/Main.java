package com.automatization.training.bonus.bubble;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 56, 88, 1, 89, 45};
        //method for sorting
        System.out.println("Ascending order: ");
        array = SortFunction.sortArrayAscending(array);
        for (int arraySorted1 : array) {
            System.out.println(arraySorted1);
        }

        System.out.println("===================\nDescending order: ");
        array = SortFunction.sortArrayDescending(array);
        for (int arraySorted2 : array) {
            System.out.println(arraySorted2);
        }
    }
}
