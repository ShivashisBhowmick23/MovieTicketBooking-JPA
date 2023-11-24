package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public List<Movies> addMovies(List<Movies> movies) {
        List<Movies> addMultipleMovies = movieRepo.saveAll(movies);
        return addMultipleMovies;

    }

    @Override
    public Optional<Movies> findByMovieId(int movie_id) {
        return movieRepo.findById(movie_id);
    }

    @Override
    public List<Movies> findAllMovies() {
        List<Movies> allMovies = movieRepo.findAll();
        int totalCount = allMovies.size();
        System.out.println("Total Number of movies:: "+totalCount);
        return allMovies;

    }

    @Override
    public boolean deleteByMovieId(int movie_id) {
        movieRepo.deleteById(movie_id);
        return true;
    }

    @Override
    public Movies updateMovieById(Movies movie) {
        movieRepo.save(movie);
        return movie;
    }
}
