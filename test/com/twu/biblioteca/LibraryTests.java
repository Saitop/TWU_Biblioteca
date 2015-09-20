package com.twu.biblioteca;

import org.junit.Test;

/**
 * Created by hxlin on 9/20/15.
 */
public class LibraryTests {

    @Test
    public void getAllBooksFromLibrary() throws Exception{
        assertEquals(1, Library.getAllBooks().length);
    }
}
