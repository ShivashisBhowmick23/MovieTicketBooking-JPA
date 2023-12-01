package com.boot.moviebooking.util;

import org.springframework.stereotype.Component;

@Component
public class URLMoviesConstant {

    public static final String ADD_SINGLE_MOVIE = "/movie/addMovie";

    public static final String MOVIES_REST_URL = "/movie-ticket";
    public static final String THEATRES_REST_URL = "/theatres";


    public static final String ADD_MULTIPLE_MOVIES = "/movie/addMovies";
    public static final String VIEW_ALL_MOVIES = "/movies/allMovies";
    public static final String VIEW_MOVIE_BY_MOVIE_ID = "/movies/{movie_id}";

    public static final String VIEW_MOVIES_BY_MOVIE_CATEGORY = "/movies/category/{movie_category}";

    public static final String  VIEW_MOVIES_BY_THEATRE_NAME = "/theatre-name/{theatre_name}";
    public static final String  VIEW_MOVIES_BY_THEATRE_ID = "/theatre-id/{theatre_id}";






}
