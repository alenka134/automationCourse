package com.automatization.training.composition1.targil1;

public class Main {
    public static void main(String[] args) {

        Author gal = new Author("Gal Matalon", "Netanya");
        Book javaBook = new Book("The java world for QA", 97, gal);
        Book seleniumBook = new Book("The selenium world", 197, gal);

        javaBook.whoIsAuthor();
        seleniumBook.whoIsAuthor();
    }
}
