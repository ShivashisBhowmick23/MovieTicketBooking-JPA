package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Movies;

import java.util.List;
import java.util.Optional;

public interface IMovieService {

    public Movies addMovie(Movies movie);

    public List<Movies> addMovies(List<Movies> movies);

    public Optional<Movies> findByMovieId(int movie_id);

    public boolean deleteByMovieId(int movie_id);

    public Movies updateMovieById(int  movie_id);
}
