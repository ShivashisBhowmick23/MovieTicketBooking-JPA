package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Movies;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IMovieService {

    public Movies addMovie(Movies movie);

    public String addMovies(List<Movies> movies);

    public Optional<Movies> findByMovieId(int movie_id);

    public List<Movies> findAllMovies();

    public boolean deleteByMovieId(int movie_id);

    public Movies updateMovieById(int movie_id);
}
