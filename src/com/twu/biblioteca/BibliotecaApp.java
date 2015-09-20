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
        System.out.println(" ");
    }

    private static void showAllBooksInLibrary() {
        List<Book> books = new ArrayList<Book>();
        Book theGreatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925");
        Book refactoring = new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", "1999");
        Book tdd = new Book("Test-Driven Development by Example", "Kent Beck", "2003");

        books.add(theGreatGatsby);
        books.add(refactoring);
        books.add(tdd);

        Library library = new Library(books);
        String booksDetails = library.showBooks();
        System.out.print(booksDetails);
    }
}
