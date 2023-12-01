package com.boot.moviebooking.controller;

import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.entity.Theatres;
import com.boot.moviebooking.repository.MovieRepository;
import com.boot.moviebooking.service.DirectorServiceImpl;
import com.boot.moviebooking.service.MovieServiceImpl;
import com.boot.moviebooking.service.TheatreServiceImpl;
import com.boot.moviebooking.util.URLMoviesConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(URLMoviesConstant.MOVIES_REST_URL)
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;

    @Autowired
    MovieRepository movieRepo;

    @GetMapping(URLMoviesConstant.VIEW_MOVIE_BY_MOVIE_ID)
    public Optional<Movies> findByMovieId(@PathVariable("movie_id") int movie_id) {
        return movieService.findByMovieId(movie_id);
    }


    @PostMapping(URLMoviesConstant.ADD_SINGLE_MOVIE)
    public Movies addSingleMovie(@RequestBody Movies movie) {
        return movieService.addMovie(movie);
    }


    @PostMapping(URLMoviesConstant.ADD_MULTIPLE_MOVIES)
    public List<Movies> addMultipleMovies(@RequestBody List<Movies> movies) {
        List<Movies> multiple_movies = movieService.addMovies(movies);
        return multiple_movies;
    }


    @GetMapping(URLMoviesConstant.VIEW_ALL_MOVIES)
    public List<Movies> findAllMovies() {
        return movieService.findAllMovies();
    }


    @DeleteMapping(URLMoviesConstant.VIEW_MOVIE_BY_MOVIE_ID)
    public boolean deleteByMovieId(@PathVariable("movie_id") int movie_id) {
        movieService.deleteByMovieId(movie_id);
        return true;
    }

    @PutMapping(URLMoviesConstant.VIEW_MOVIE_BY_MOVIE_ID)
    public Movies updateMovieByMovieId(@RequestBody Movies movie) {
        Movies newMovie = movieService.updateMovieById(movie);
        return newMovie;
    }

    @GetMapping(URLMoviesConstant.VIEW_MOVIES_BY_MOVIE_CATEGORY)
    public List<Movies> getMoviesByCategory(@PathVariable("movie_category") String movie_category) {
        List<Movies> result = movieRepo.findByCategory(movie_category);
        System.out.println("Number of movies with " + movie_category + " " + result.stream().count());
        return result;


    }


}
