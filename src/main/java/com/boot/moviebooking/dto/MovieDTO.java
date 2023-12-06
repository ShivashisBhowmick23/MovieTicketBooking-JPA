package com.boot.moviebooking.dto;

import com.boot.moviebooking.entity.Directors;
import lombok.Data;

@Data
public class MovieDTO {

    private String movie_name;
    private String movie_category;
    private String movie_rating;

    private Directors directors;
}
