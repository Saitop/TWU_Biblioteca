package com.twu.biblioteca;

/**
 * Created by hxlin on 9/29/15.
 */
public class Movie {
    private int id;
    private String name;
    private String year;
    private String director;
    private String movieRating;

    public Movie(int id, String name, String year, String director, String movieRating ) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    public Movie() {

    }

    public void setMovie(int id, String name, String year, String director, String movieRating ){
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    public int getId(){
        return this.id;
    }

    public String getDetails() {
        String movieDetail = String.format("%d : %s | %s | %s", id, name, year, director, movieRating);
        return movieDetail;
    }
}
