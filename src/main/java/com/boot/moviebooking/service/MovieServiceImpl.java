package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MovieServiceImpl implements IMovieService {

    @Autowired
    MovieRepository movieRepo;

    @Override
    public Movies addMovie(Movies movie) {
        Movies addOneMovie = new Movies();
        movieRepo.save(addOneMovie);
        return addOneMovie;


    }

    @Override
    public List<Movies> addMovies(List<Movies> movies) {
        List<Movies> addMultipleMovies = new ArrayList<>();
        movieRepo.saveAll(addMultipleMovies);
        return addMultipleMovies;

    }

    @Override
    public Optional<Movies> findByMovieId(int movie_id) {
        return movieRepo.findById(movie_id);
    }

    @Override
    public boolean deleteByMovieId(int movie_id) {
         movieRepo.deleteById(movie_id);
         return true;
    }

    @Override
    public Movies updateMovieById(int movie_id) {
        Movies updatedMovies = new Movies();
         movieRepo.save(updatedMovies);
        return  updatedMovies;
    }
}
