package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Movies;

import java.util.List;

public interface IMovieService {

    public Movies addMovie(Movies movie);

    public String addMovies(List<Movies> movies);

    public Movies findByMovieId(int movie_id);

    public Movies deleteByMovieId(int movie_id);

    public Movies updateMovieById(int  movie_id);
}
