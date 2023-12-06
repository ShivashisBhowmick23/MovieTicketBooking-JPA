package com.boot.moviebooking.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Entity
public class Movies {
    @Id
    @NotNull(message = "Movie ID cannot be NULL or EMPTY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id;

    @NotNull(message = "Movie Name cannot be NULL or EMPTY")
    private String movie_name;

    @NotNull(message = "Movie Category cannot be NULL or EMPTY")
    private String movie_category;

    @NotNull(message = "Release Year Cannot be NULL or EMPTY")
    private String releaseYear;

    @NotNull(message = "MOVIE RATING cannot be NULL or EMPTY")
    private String rating;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Directors directors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "movies_theatres",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "theatre_id"))    @JoinColumn(name = "theatre_id")
    private Set<Theatres> theatres = new HashSet<>();

    public Movies() { // for using JPA we need to use NO ARGUMENTS CONSTRUCTOR
    }

    public Movies(String movie_name, String movie_category, String releaseYear, String rating, Directors directors, Set<Theatres> theatres) {
        this.movie_name = movie_name;
        this.movie_category = movie_category;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.directors = directors;
        this.theatres = theatres;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public void setMovie_category(String movie_category) {
        this.movie_category = movie_category;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setDirectors(Directors directors) {
        this.directors = directors;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setTheatres(Set<Theatres> theatres) {
        this.theatres = theatres;
    }

    @Override
    public String toString() {
        return "Movies{" + "movie_id=" + movie_id + ", movie_name='" + movie_name + '\'' + ", movie_category='" + movie_category + '\'' + ", releaseYear='" + releaseYear + '\'' + ", rating='" + rating + '\'' + ", directors=" + directors + ", theatres=" + theatres + '}';
    }
}

/*
 * we don't want set the Id so we will exclude it from the constructor also we
 * don't want to set it by the user so we won't keep the setter also for the id'
 */
