package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static boolean isRunning = true;
    public final static int LIST_BOOKS = 1;
    public final static int CHECK_OUT_BOOK = 2;
    public final static int RETURN_BOOK = 3;
    public final static int LIST_MOVIES = 4;
    public final static int QUIT = 5;
    private static List<Book> books = new ArrayList<Book>();
    private static List<Book> booksRestore = new ArrayList<Book>();
    public static Book bookTemp = new Book();
    private static Library library;

    public static void main(String[] args) {
        welcomeInfo();
        initLibrary();

        while(isRunning){
            int command = mainMenu();
            parseCommand(command);
        }

    }

    private static void initLibrary() {
        Book theGreatGatsby = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "1925");
        Book refactoring = new Book(2,"Refactoring: Improving the Design of Existing Code", "Martin Fowler", "1999");
        Book tdd = new Book(3, "Test-Driven Development by Example", "Kent Beck", "2003");

        books.add(theGreatGatsby);
        books.add(refactoring);
        books.add(tdd);

        booksRestore.add(theGreatGatsby);
        booksRestore.add(refactoring);
        booksRestore.add(tdd);
        library = new Library(books);
    }


    private static int mainMenu() {
        int choice = 0;

        System.out.println(" ");
        System.out.println("* * * * * * * * * * * * * * * * *  *");
        System.out.println("* Main Menu :                      *");
        System.out.println("*       1. List Books              *");
        System.out.println("*       2. Checkout Book           *");
        System.out.println("*       3. Return Books            *");
        System.out.println("*       4. List Movies             *");
        System.out.println("*       5. Quit                    *");
        System.out.println("*                                  *");
        System.out.print("* please choose your command  : ");
        Scanner inputScanner = new Scanner(System.in);
        choice = Integer.parseInt(inputScanner.nextLine());
        System.out.println("* * * * * * * * * * * * * * * * *  *");
        System.out.println(" ");
        return choice;

    }

    private static void parseCommand(int cmd) {
        Scanner inputScanner = new Scanner(System.in);
        switch(cmd){
            case LIST_BOOKS:
                showAllBooksInLibrary(library);
                break;
            case CHECK_OUT_BOOK:
                System.out.println("please select the book you want to checkout (input the id of the book): ");
                String checkOutBookId;
                checkOutBookId = inputScanner.nextLine();
                checkOutBook(books,checkOutBookId);
                break;
            case RETURN_BOOK:
                System.out.println("please select the book you want to return (input the id of the book): ");
                String ReturnBookId;
                ReturnBookId = inputScanner.nextLine();
                returnBook(ReturnBookId);
                break;
            case LIST_MOVIES:
                showAllMoviesInLibrary(library);
                break;
            case QUIT:
                isRunning = false ;
                break;
            default:
                System.out.println(" Select a valid option!");
        }
    }

    private static void showAllMoviesInLibrary(Library library) {

    }

    private static int returnBook(String returnBookId) {
        if(isExistBook(booksRestore, returnBookId)){
            Book book = bookTemp;
            if(!isExistBook(books, returnBookId)){
                books.add(book);
                System.out.println("successful return book!");
            }
        }
        else System.out.println("unsuccessful return book!!");
        return books.size();
    }

    private static int checkOutBook(List<Book> books, String checkOutBookId) {
        if(isExistBook(books, checkOutBookId)){
            books.remove(bookTemp);
            System.out.println("Thank you! Enjoy the book");
        }
        else System.out.println("That book is not available.");
        return books.size();


    }

    private static boolean isExistBook(List<Book> books, String checkOutBookId) {
        int idOfBook = Integer.parseInt(checkOutBookId);
        for(Book book : books){
            bookTemp = book;
            if (bookTemp.getId()==idOfBook){
                return true;
            }
        }
        return false;
    }


    private static void welcomeInfo() {
        System.out.println("=====================================================");
        System.out.println("Welcome to Bibiloteca! Enjoy you adventure in books!");
        System.out.println("=====================================================");
        System.out.println(" ");
    }

    private static void showAllBooksInLibrary(Library library) {
        String booksDetails = library.showBooks();
        System.out.print(booksDetails);

    }
}
