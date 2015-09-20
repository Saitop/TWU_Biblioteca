package com.twu.biblioteca;

/**
 * Created by hxlin on 9/20/15.
 */
public class Book {

    private String title;
    private String author;
    private String publishedYear;

    public Book(String title, String author, String publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }


    public String getDetails() {
        String bookDetail = String.format("%s | %s | %s", title, author, publishedYear);
        return bookDetail;
    }
}