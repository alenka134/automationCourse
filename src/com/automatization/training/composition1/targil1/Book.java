package com.automatization.training.composition1.targil1;

public class Book {
    private String nameBook;
    private int price;
    private Author author;

    public Book(String nameBook, int price, Author author) {
        this.nameBook = nameBook;
        this.price = price;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void whoIsAuthor() {
        System.out.println(author.getAuthorName());
    }
}
