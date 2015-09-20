package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 * Created by hxlin on 9/20/15.
 */
public class LibraryTests {
    private List<Book> books;
    private Library library;

    @Before
    public void setUp() {
        books = new ArrayList<Book>();
        library = new Library(books);
    }

    @Test
    public void getAllBooksFromLibrary() throws Exception{
        assertEquals(books, library.getBooks());
    }

    @Test
    public void showBooksDetailsInSring() throws Exception{
        Book book = mock(Book.class);
        when(book.getDetails()).thenReturn("abracadabra");
        books.add(book);
        String booksDetails = library.showBooks();
        assertThat(booksDetails, is("abracadabra\n"));
    }
}
