package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static boolean isRunning = true;
    public final static int LIST_BOOKS = 1;
    public final static int QUIT = 2;

    public static void main(String[] args) {
        welcomeInfo();


        while(isRunning){
            int command = mainMenu();
            parseCommand(command);
        }

    }


    private static int mainMenu() {
        int choice = 0;

        System.out.println(" ");
        System.out.println("* * * * * * * * * * * * * * * * *  *");
        System.out.println("* Main Menu :                      *");
        System.out.println("*       1. List Books              *");
        System.out.println("*       2. Quit                    *");
        System.out.println("*                                  *");
        System.out.print  ("* please choose your command  : ");
        Scanner inputScanner = new Scanner(System.in);
        choice = Integer.parseInt(inputScanner.nextLine());
        System.out.println("* * * * * * * * * * * * * * * * *  *");
        System.out.println(" ");
        return choice;

    }

    private static void parseCommand(int cmd) {
        switch(cmd){
            case LIST_BOOKS:
                showAllBooksInLibrary();
                break;
            case QUIT:
                isRunning = false ;
                break;
            default:
                System.out.println(" Select a valid option!");
        }
    }


    private static void welcomeInfo() {
        System.out.println("=====================================================");
        System.out.println("Welcome to Bibiloteca! Enjoy you adventure in books!");
        System.out.println("=====================================================");
        System.out.println(" ");
    }

    private static void showAllBooksInLibrary() {
        List<Book> books = new ArrayList<Book>();
        Book theGreatGatsby = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "1925");
        Book refactoring = new Book(2,"Refactoring: Improving the Design of Existing Code", "Martin Fowler", "1999");
        Book tdd = new Book(3, "Test-Driven Development by Example", "Kent Beck", "2003");

        books.add(theGreatGatsby);
        books.add(refactoring);
        books.add(tdd);

        Library library = new Library(books);
        String booksDetails = library.showBooks();
        System.out.print(booksDetails);
    }
}
