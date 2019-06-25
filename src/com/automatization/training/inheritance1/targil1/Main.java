package com.automatization.training.inheritance1.targil1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alon", "alon@gmail.com","Azure", false);
        Student student2 = new Student("Solo", "solo@gmail.com", "Mes",  false);
        Student student3 = new Student("Lena", "lena@gmail.com","Quest", true);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}
