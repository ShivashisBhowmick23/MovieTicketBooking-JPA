package com.boot.moviebooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Theatres {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Theatre ID cannot be Null")
    private String theatre_id ;
    @NotNull(message = "Theatre name cannot be NULL")
    private String theatre_name;
    @NotNull(message = "Theatre movie timing cannot be null")
    private String movie_timings;
    @NotNull(message = "Theatre location cannot be null")
    private String location;
    @ManyToMany(mappedBy = "theatres", fetch = FetchType.EAGER)
    @JsonIgnore
    List<Movies> movies = new ArrayList<>();

    public Theatres() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheatre_id() {
        return theatre_id;
    }

    public void setTheatre_id(String theatre_id) {
        this.theatre_id = theatre_id;
    }

    public String getTheatre_name() {
        return theatre_name;
    }

    public void setTheatre_name(String theatre_name) {
        this.theatre_name = theatre_name;
    }

    public String getMovie_timings() {
        return movie_timings;
    }

    public void setMovie_timings(String movie_timings) {
        this.movie_timings = movie_timings;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }

    public Theatres(int id, String theatre_id, String theatre_name, String movie_timings, String location, List<Movies> movies) {
        this.id = id;
        this.theatre_id = theatre_id;
        this.theatre_name = theatre_name;
        this.movie_timings = movie_timings;
        this.location = location;
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Theatres{" +
                "id=" + id +
                ", theatre_id='" + theatre_id + '\'' +
                ", theatre_name='" + theatre_name + '\'' +
                ", movie_timings='" + movie_timings + '\'' +
                ", location='" + location + '\'' +
                ", movies=" + movies +
                '}';
    }
}