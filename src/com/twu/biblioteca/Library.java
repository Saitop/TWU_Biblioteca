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


    public Library setBooks(List<Book> books) {
        this.books = books;
        Library library= new Library(books);
        return library ;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String showBooks() {
        String booksList = "";
        for (Book book : books) {
            booksList = booksList + book.getDetails() + "\n";
        }
        return booksList;
    }
}
