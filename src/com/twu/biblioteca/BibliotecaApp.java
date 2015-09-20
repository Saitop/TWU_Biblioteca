package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        welcomeInfo();
        showAllBooksInLibrary();
    }

    private static void welcomeInfo() {
        System.out.println("=====================================================");
        System.out.println("Welcome to Bibiloteca! Enjoy you adventure in books!");
        System.out.println("=====================================================");
    }

    private static void showAllBooksInLibrary() {
        List<Book> books = new ArrayList<Book>();
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling","1997");
        books.add(harryPotter);

        Library library = new Library(books);
        String booklist = library.showBooksDetails();
        System.out.print(booklist);
    }
}
