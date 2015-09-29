package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hxlin on 9/20/15.
 */
public class Library {
    List<Book> books = new ArrayList<Book>();
    List<Movie> movies = new ArrayList<Movie>();

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library(List<Movie> movies, List<Book> books) {
        this.movies = movies;
    }


    public Library setBooks(List<Book> books) {
        this.books = books;
        Library library= new Library(books);
        return library ;
    }

    public Library setMovies(List<Movie> movies) {
        this.movies = movies;
        Library library = new Library(movies, null);
        return library;
    }

    public List<Book> getBooks() {
        return books;
    }
    public List<Movie> getMovies() {
        return movies;
    }

    public String showBooks() {
        String booksList = "";
        for (Book book : books) {
            booksList = booksList + book.getDetails() + "\n";
        }
        return booksList;
    }
    public String showMovies() {
        String moviesList = "";
        for (Movie movie : movies) {
            moviesList = moviesList + movie.getDetails() + "\n";
        }
        return moviesList;
    }


}
