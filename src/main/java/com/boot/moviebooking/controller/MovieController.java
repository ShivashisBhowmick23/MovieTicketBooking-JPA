package com.boot.moviebooking.controller;

import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.service.DirectorServiceImpl;
import com.boot.moviebooking.service.MovieServiceImpl;
import com.boot.moviebooking.service.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie-ticket")
public class MovieController {

    @Autowired
    MovieServiceImpl movieService;
    @Autowired
    DirectorServiceImpl directorService;
    @Autowired
    TheatreServiceImpl theatreService;


    @GetMapping("/movie/{movie_id}")
    public Optional<Movies> findByMovieId(@PathVariable("movie_id") int movie_id) {
        return movieService.findByMovieId(movie_id);
    }


    @PostMapping("/movie/addMovie")
    public Movies addSingleMovie(@RequestBody Movies movie) {
        return movieService.addMovie(movie);
    }


    public String addMultipleMovies(List<Movies> movies) {
        movieService.addMovies(movies);
        return "Success";
    }


    @GetMapping("/movie/allMovies")
    public List<Movies> findAllMovies() {
        return movieService.findAllMovies();
    }


    public boolean deleteByMovieId(@PathVariable("movie_id") int movie_id) {
        movieService.deleteByMovieId(movie_id);
        return true;
    }

    public Movies updateMovieByMovieId(int movie_id) {
        Movies newMovie = new Movies();
        newMovie = movieService.updateMovieById(movie_id);
        return newMovie;
    }

}
