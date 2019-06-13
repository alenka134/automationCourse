package com.automatization.training.composition1.targil1;

public class Author {
    private String authorName;
    private String authorAddress;

    public Author(String authorName, String authorAddress) {
        this.authorName = authorName;
        this.authorAddress = authorAddress;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAddress() {
        return authorAddress;
    }

    public void setAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }
}
