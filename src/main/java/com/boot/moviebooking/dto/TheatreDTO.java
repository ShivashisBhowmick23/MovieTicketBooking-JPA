package com.boot.moviebooking.dto;

import com.boot.moviebooking.entity.Movies;
import lombok.Data;

import java.util.Set;
@Data
public class TheatreDTO {

    private String theatre_id;
    private String theatre_name;
    private String location;
    private Set<MovieDTO> movies;

}
