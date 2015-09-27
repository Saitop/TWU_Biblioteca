package com.twu.biblioteca;

/**
 * Created by hxlin on 9/20/15.
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private String publishedYear;

    public Book(int id, String title, String author, String publishedYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public Book() {

    }

    public void setBook(int id, String title, String author, String publishedYear){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }


    public String getDetails() {
        String bookDetail = String.format("%d : %s | %s | %s", id, title, author, publishedYear);
        return bookDetail;
    }
}
