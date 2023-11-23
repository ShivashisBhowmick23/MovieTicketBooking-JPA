package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    MovieRepository movieRepo;


    @Override
    public Movies addMovie(Movies movie) {
//        Movies addOneMovie = new Movies();
        movieRepo.save(movie);
        return movie;


    }

    @Override
    public String addMovies(List<Movies> movies) {
        List<Movies> addMultipleMovies = new ArrayList<>();
        movieRepo.saveAll(addMultipleMovies);
        return "Multiple Movies Added  -- Status Success";

    }

    @Override
    public Optional<Movies> findByMovieId(int movie_id) {
        return movieRepo.findById(movie_id);
    }

    @Override
    public List<Movies> findAllMovies() {
        List<Movies> allMovies = movieRepo.findAll();
        int totalCount = allMovies.size();
        System.out.println(totalCount);
        return allMovies;

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
        return updatedMovies;
    }
}
