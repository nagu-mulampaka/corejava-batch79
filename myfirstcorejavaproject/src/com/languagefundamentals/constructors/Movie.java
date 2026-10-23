package com.languagefundamentals.constructors;

public class Movie {

    String name;
    String hero;
    String director;
    String heroine;
    double budget;

    // No-argument constructor
    Movie() {
        System.out.println("No-arg Constructor is called");
    }

    // Copy constructor
    Movie(Movie movie) {
        this.name = movie.name;
        this.hero = movie.hero;
        this.heroine = movie.heroine;
        this.director = movie.director;
        this.budget = movie.budget;
        System.out.println("Copy Constructor is called");
    }

    public static void main(String[] args) {

        System.out.println("main method started");

        // Creating the first Movie object
        Movie movie = new Movie();
        movie.hero = "Mahesh Babu";
        movie.heroine = "Priyanka Chopra";
        movie.director = "SS Rajamouli";
        movie.budget = 50000000000.00;
        movie.name = "Varanashi";
        movie.movieInfo();

        // Creating the second Movie object by copying the first object
        Movie movie1 = new Movie(movie);
        movie1.movieInfo();

        System.out.println("main method ended");
    }

    void movieInfo() {
        System.out.println("Name of the Movie: " + name);
        System.out.println("Hero of the Movie: " + hero);
        System.out.println("Heroine of the Movie: " + heroine);
        System.out.println("Director of the Movie: " + director);
        System.out.println("Budget of the Movie: " + budget);
        System.out.println("************************************");
    }
}
