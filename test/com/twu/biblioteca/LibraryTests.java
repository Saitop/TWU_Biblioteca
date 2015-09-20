package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by hxlin on 9/20/15.
 */
public class LibraryTests {
    private List<Book> books;
    private Library library;

    @Test
    public void getAllBooksFromLibrary() throws Exception{
        books = new ArrayList<Book>();
        library = new Library(books);
        assertEquals(books, library.getBooks());
    }
}
