package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hxlin on 9/20/15.
 */
public class Library {
    List<Book> books = new ArrayList<Book>();

    public Library(List<Book> books) {
        this.books = books;
    }


    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String showBooksDetails() {
        String booksList = "";
        for (Book book : books) {
            booksList = booksList + book.getDetails() + "\n";
        }
        return booksList;
    }
}
