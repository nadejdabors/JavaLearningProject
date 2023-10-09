package com.tekwillacademy.bookcollectiontask;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public void printTheBookDetails(){
        System.out.println("The book title is: " +getTitle() + " written by " + getAuthor());
    }
}
